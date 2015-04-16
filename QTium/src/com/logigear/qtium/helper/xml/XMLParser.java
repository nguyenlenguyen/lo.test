package com.logigear.qtium.helper.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XMLParser {
	
	public static DeviceConfigItem parseXMLToList(String xmlPath,
			String testName) throws ParserConfigurationException, SAXException,
			IOException {
		// ArrayList<ConfigItem> allItem = new ArrayList<ConfigItem>();
		File stocks = new File(xmlPath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

		/*
		 * InputSource is = new InputSource(); is.setCharacterStream(new
		 * StringReader(xmlSnippet));
		 */

		Document doc = dBuilder.parse(stocks);
		// Document doc = dBuilder.parse(is);
		doc.getDocumentElement().normalize();

		Element elementTest = null;
		Node node = null;

		NodeList testElements = doc.getElementsByTagName("test");
		for (int i = 0; i < testElements.getLength(); i++) {
			node = testElements.item(i);
			Element element = (Element) node;

			if (element.getAttribute("name").compareToIgnoreCase(testName) == 0) {
				elementTest = element;
				break;
			}
		} // end for

		DeviceConfigItem deviceConfigItem = null;
		GridConfigItem gridConfigItem = null;

		if (elementTest != null) {
			NodeList allParamNodes = elementTest
					.getElementsByTagName("parameter");

			for (int i = 0; i < allParamNodes.getLength(); i++) {
				Node paramNode = allParamNodes.item(i);
				Element paramElement = (Element) paramNode;
				boolean isDeviceNode = paramElement.getAttribute("name")
						.equalsIgnoreCase("device");
				boolean isGridNode = paramElement.getAttribute("name").equalsIgnoreCase("grid");

				if (isDeviceNode) {
					deviceConfigItem = new DeviceConfigItem();
					Node providerNode = paramElement.getElementsByTagName(
							"provider").item(0);
					Element providerElement = (Element) providerNode;
					String providerName = providerElement.getAttribute("name");
					String appType = providerElement.getAttribute("apptype");
					deviceConfigItem.setProvider(providerName);
					deviceConfigItem.setApptype(appType);
					deviceConfigItem.setDevice(paramElement
							.getAttribute("value"));
										
					//Minh.trinh - Hard code driver replace to [the old code]
					if(providerName.toLowerCase().contentEquals("selenium"))
					{
						if(appType.toLowerCase().contentEquals("chrome"))
							deviceConfigItem.setProviderProperty("driverexe", "Resources\\chromedriver.exe");
						else if(appType.toLowerCase().contentEquals("ie"))
							deviceConfigItem.setProviderProperty("driverexe", "Resources\\IEDriverServer.exe");
					}
					else if(providerName.toLowerCase().contentEquals("appium"))
					{
						NodeList allProviderProperties = providerNode
								.getChildNodes();
	
						for (int j = 0; j < allProviderProperties.getLength(); j++) {
							Node providerPropNode = allProviderProperties.item(j);
							if (providerPropNode.getNodeType() == Node.ELEMENT_NODE) {
								String providerPropName = providerPropNode.getNodeName();
								String providerPropValue = providerPropNode.getTextContent();
								deviceConfigItem.setProviderProperty(providerPropName, providerPropValue);							
								// allItem.add(deviceConfigItem);
							} // end if
						} // end for	
					}				
				} else if(isGridNode) {					
					gridConfigItem = new GridConfigItem();
					gridConfigItem.setUsingGrid(paramElement.getAttribute(
							"value").equals("1"));
					Node ip = paramElement.getElementsByTagName("ip").item(0);
					Node port = paramElement.getElementsByTagName("port").item(
							0);
					gridConfigItem.setIp(ip.getTextContent());
					gridConfigItem.setPort(port.getTextContent());
					// allItem.add(gridConfigItem);
				} // end if-else
			} // end for

			if (deviceConfigItem != null) {
				deviceConfigItem.setGridConfigItem(gridConfigItem);
			}
		}

		return deviceConfigItem;
	}
}
