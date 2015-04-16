package com.logigear.qtium.driver.appium.android;

import com.logigear.qtium.QTiumConstants;
import com.logigear.qtium.driver.QTiumLocalDriver;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class QTiumAndroidNativeLocalDriver extends QTiumLocalDriver {
	protected String _remoteAddress;
	protected String _appPackage;
	protected String _appActivity;

	public void setRemoteAddress(String remoteAddress) {
		this._remoteAddress = remoteAddress;
	}
	
	public void setAppPackage(String appPackage) {
		this._appPackage = appPackage;
	}
	
	public void setAppActivity(String appActivity) {
		this._appActivity = appActivity;
	}

	public QTiumAndroidNativeLocalDriver() {
	}

	@Override
	public String getDeviceName() {
		return QTiumConstants.DEVICE_ANDROID;
	} 

	@Override
	public String getProvider() {
		return "appium";
	}

	@Override
	public void createWebDriver() throws MalformedURLException {
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability("appPackage", _appPackage);
		capabilities.setCapability("appActivity", _appActivity);


		/*this._webDriver = new AppiumDriver(new URL(_remoteAddress),
				capabilities);*/
		this._webDriver = new AndroidDriver(new URL(_remoteAddress), capabilities);
		if(_webDriver.getSessionId() == null){
			System.out.println("QTiumAndroidNativeLocalDriver - closed!");
		}else{
			System.out.println("QTiumAndroidNativeLocalDriver - OKKK!");
		}

	}

	@Override
	public String getApplicationType() {
		return QTiumConstants.APP_TYPE_NATIVE_APP;
	}

} // end class
