package rakuten.common;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.logigear.selenium.QTiumAutomation;
import com.logigear.selenium.QTiumSetting;
import org.junit.BeforeClass;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.xml.XmlTest;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class Common {

	public void Config() {
		QTiumSetting.setObjecWait(480);
		QTiumSetting.setElementWait(3);		
	}
	public void Navigate(String url)
	{
		QTiumAutomation.openURL(url);
	}
	
	public void CloseBrowser()
	{
		QTiumAutomation.close();
	}

    public String getSiteID()
    {
        String currentURL = QTiumAutomation.getPageUrl().replace("//", "").split("/")[0];
        String siteID = currentURL.split("\\.")[currentURL.split("\\.").length-1].toLowerCase();
        if (siteID.equals("uk"))
        {
            siteID = "gb";
        }
        return siteID;
    }

    public String getSecureUrl()
    {
        String currentURL = QTiumAutomation.getPageUrl().replace("http://www","").split("/")[0];
        return "https://secure" + currentURL;
    }

    public String getBaseUrl()
    {
        String currentURL = QTiumAutomation.getPageUrl().replace("http://www","").split("/")[0];
        return "http://www" + currentURL;
    }
}