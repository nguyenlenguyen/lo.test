package com.logigear.qtium;

import com.logigear.qtium.driver.QTiumDriverManager;
import com.logigear.selenium.QTiumSetting;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class QTiumNavigator {
	
	/**
	 * Open a web page or start native application on Max OS X
	 * @param url
	 * @throws Exception
	 */
	public static void open(String url) throws Exception{
		//TODO check the platform => throws warning
		//get exist WebDriver or create a new WebDriver
		WebDriver webDriver = QTiumDriverManager.getAndCheckWebDriver();
		webDriver.manage().timeouts().pageLoadTimeout(QTiumSetting.getObjecWait(), TimeUnit.SECONDS);		
		webDriver.get(url);		
	}
	
	/**
	 * Start native application on Android
	 * @param url
	 * @throws Exception
	 */
	public static void open() throws Exception{
		//TODO check the platform => throws warning
		//get exist WebDriver or create a new WebDriver
		
		/*WebDriver webDriver = */
		QTiumDriverManager.getAndCheckWebDriver();		
	}
}
