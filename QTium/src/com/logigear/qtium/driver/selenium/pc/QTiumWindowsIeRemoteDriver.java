package com.logigear.qtium.driver.selenium.pc;

import com.logigear.qtium.QTiumConstants;
import com.logigear.qtium.driver.QTiumRemoteDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class QTiumWindowsIeRemoteDriver extends QTiumRemoteDriver {
	
	@Override
	public String getDeviceName() {
		return QTiumConstants.DEVICE_PC;
	}

	public QTiumWindowsIeRemoteDriver() {

	} // end method

	@Override
	public String getProvider() {
		return "selenium";
	}

	@Override
	public void createWebDriver() throws MalformedURLException {
		Capabilities desiredCapabilities = DesiredCapabilities
				.internetExplorer();

		this._webDriver = new RemoteWebDriver(new URL(_hubUrl), desiredCapabilities);
	

	}
	
	@Override
	public String getApplicationType() {
		return QTiumConstants.APP_TYPE_IE;
	}
} // end class
