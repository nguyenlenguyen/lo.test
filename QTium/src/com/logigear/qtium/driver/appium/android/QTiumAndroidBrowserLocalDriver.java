package com.logigear.qtium.driver.appium.android;

import com.logigear.qtium.QTiumConstants;
import com.logigear.qtium.driver.QTiumLocalDriver;
import com.logigear.selenium.QTiumSetting;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class QTiumAndroidBrowserLocalDriver extends QTiumLocalDriver {
	protected String _remoteAddress;

	public void setRemoteAddress(String remoteAddress) {
		this._remoteAddress = remoteAddress;
	}

	public QTiumAndroidBrowserLocalDriver() {
	}

	@Override
	public String getDeviceName() {
		return QTiumConstants.DEVICE_ANDROID;
	} // end method

	@Override
	public String getProvider() {
		return "appium";
	}

	@Override
	public void createWebDriver() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Browser");		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "Android");
        capabilities.setCapability("platformVersion", "4.4.4");

		/*
		 * if (QTiumAutomation.getDriver() != null) { AppiumDriver driver =
		 * (AppiumDriver) QTiumAutomation.getDriver(); driver.quit(); }
		 */

		//this._webDriver = new AppiumDriver(new URL(_remoteAddress),
				//capabilities);
        this._webDriver = new AndroidDriver(new URL(_remoteAddress), capabilities);
        this._webDriver.manage().timeouts().pageLoadTimeout(QTiumSetting.getObjecWait(), TimeUnit.SECONDS);

	}

	@Override
	public String getApplicationType() {
		return QTiumConstants.APP_TYPE_BUILTIN_BROWSER;
	}

} // end class
