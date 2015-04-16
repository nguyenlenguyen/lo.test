package com.logigear.qtium.driver.appium.ios;

import com.logigear.qtium.QTiumConstants;
import com.logigear.qtium.driver.QTiumLocalDriver;

import io.appium.java_client.ios.IOSDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class QTiumiOSSafariLocalDriver extends QTiumLocalDriver {
	protected String _remoteAddress;

	public void setRemoteAddress(String remoteAddress) {
		this._remoteAddress = remoteAddress;
	}

	public QTiumiOSSafariLocalDriver() {
	}

	@Override
	public String getDeviceName() {
		return QTiumConstants.DEVICE_IOS;
	} // end method

	@Override
	public String getProvider() {
		return "appium";
	}

	@Override
	public void createWebDriver() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities
				.setCapability(CapabilityType.BROWSER_NAME, "Safari");

		/*
		 * if (QTiumAutomation.getDriver() != null) { AppiumDriver driver =
		 * (AppiumDriver) QTiumAutomation.getDriver(); driver.quit(); }
		 */

		/*this._webDriver = new AppiumDriver(new URL(_remoteAddress),
				desiredCapabilities);*/
		this._webDriver = new IOSDriver(new URL(this._remoteAddress),desiredCapabilities);
		_webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	@Override
	public String getApplicationType() {
		return QTiumConstants.APP_TYPE_SAFARI;
	}

} // end class
