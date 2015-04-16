package com.logigear.qtium.driver.selenium.pc;

import com.logigear.qtium.QTiumConstants;
import com.logigear.qtium.driver.QTiumLocalDriver;
import com.logigear.selenium.QTiumSetting;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class QTiumWindowsFirefoxLocalDriver extends QTiumLocalDriver {

	@Override
	public String getDeviceName() {
		return QTiumConstants.DEVICE_PC;
	}

	public QTiumWindowsFirefoxLocalDriver() {		
		System.out.println("QTiumWindowsFirefoxLocalDriver - ctor");
	}

	@Override
	public String getProvider() {
		return "selenium";
	}

	@Override
	public void createWebDriver() {
		try{
			this._webDriver = new FirefoxDriver();		
			this._webDriver.manage().timeouts().pageLoadTimeout(QTiumSetting.getObjecWait(), TimeUnit.SECONDS);
			this._webDriver.manage().window().maximize();
		}catch(Exception ex){
			System.err.println("FireFox - createWebDriver - exception: " + ex.getMessage());
		}		
	}
	
	@Override
	public String getApplicationType() {
		return QTiumConstants.APP_TYPE_FIREFOX;
	}
}
