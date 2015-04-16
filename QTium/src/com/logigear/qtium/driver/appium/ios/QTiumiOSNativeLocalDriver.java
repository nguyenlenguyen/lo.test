package com.logigear.qtium.driver.appium.ios;

import com.logigear.qtium.QTiumConstants;
import com.logigear.qtium.driver.QTiumLocalDriver;

import io.appium.java_client.ios.IOSDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class QTiumiOSNativeLocalDriver extends QTiumLocalDriver {
	protected String _remoteAddress;
	protected String _appPath;

	public void setremoteaddress(String remoteAddress) {
		this._remoteAddress = remoteAddress;
	}
	public void setapppath(String appPath){
		this._appPath = appPath;
	}
	public QTiumiOSNativeLocalDriver() {
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
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		  //TODO : 
		  capabilities.setCapability("app", this._appPath);
		/*this._webDriver = new AppiumDriver(new URL(this._remoteAddress),
				capabilities);*/
		  this._webDriver = new IOSDriver(new URL(this._remoteAddress),capabilities);
		System.out.println(this._webDriver.toString()); 
		/*if(_webDriver.getSessionId() == null){
			System.out.println("QTiumiOSNativeLocalDriver - closed!");
		}else{
			System.out.println("QTiumiOSNativeLocalDriver - OKKK!");
		}*/

	}
	@Override
	public String getApplicationType() {
		return QTiumConstants.APP_TYPE_NATIVE_APP;
	}

} // end class
