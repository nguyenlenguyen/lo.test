package com.logigear.testng;

import com.logigear.qtium.driver.QTiumDriverFactory;
import com.logigear.qtium.driver.QTiumDriverManager;
import com.logigear.qtium.driver.QTiumWebDriver;
import com.logigear.qtium.helper.xml.DeviceConfigItem;
import com.logigear.qtium.helper.xml.XMLParser;
import com.logigear.selenium.QTiumSetting;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.xml.XmlTest;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

//@author: phuc.thai
//date: 25-Jun-2014
//issue: QG-17 - Run multiple test case on different browsers

public class QTiumTestListener extends QTiumSetting implements ITestListener {

	/*private static ThreadLocal<QTiumDriverManager> _qtiumDriverManager = new ThreadLocal<QTiumDriverManager>(){
		@Override
		protected QTiumDriverManager initialValue() {
			return new QTiumDriverManager();
		}
	};*/
	
	@Override
	public void onFinish(ITestContext arg0) {
	}
	
	@Override
	public void onStart(ITestContext testContext) {
		String log = String.format("Test[%s] - thread[%d] ",
				testContext.getName(),
				Thread.currentThread().getId());
		System.out.println(log);
		logger.info(log);
		
		XmlTest xml = testContext.getCurrentXmlTest();
		String testName = xml.getName();
		DeviceConfigItem deviceConfigItem = null;
		String xmlPath = testContext.getSuite().getXmlSuite().getFileName();
		
		try {
			deviceConfigItem = XMLParser.parseXMLToList(xmlPath, testName);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		QTiumWebDriver qtiumDriver;
		try {
			qtiumDriver = QTiumDriverFactory.createInstance(deviceConfigItem);
			
			QTiumDriverManager.setQTiumDriver(qtiumDriver);
			
			String strLog = String.format("Created QTiumDriver object[%d] - on thread[%d] ", qtiumDriver.hashCode(), Thread.currentThread().getId());
			System.out.println(strLog);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub

	}
	
	private static final Log logger = LogFactory
			.getLog(QTiumTestListener.class);
}
