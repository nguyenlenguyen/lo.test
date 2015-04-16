package com.logigear.selenium;

import com.logigear.qtium.QTiumNavigator;
import com.logigear.qtium.driver.QTiumDriverManager;
import com.logigear.qtium.driver.QTiumWebDriver;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class QTiumAutomation {

	private static QTiumWebDriver getQTiumWebDriver(){
		return QTiumDriverManager.getQTiumDriver();
	} 
	
	//TODO: change public to private
	public static RemoteWebDriver getDriver(){
		return QTiumAutomation.getQTiumWebDriver().getWebDriver();
	}
	
	public static void open(){
		try {
			QTiumNavigator.open();
		} catch (Exception e) {
			System.err.println("Create WebDriver got error: " + e.getMessage());
			e.printStackTrace();
		}
	} 
	public static void openURL(String URL){
		try {
			QTiumNavigator.open(URL);
		} catch (Exception e) {
			System.err.println("Create WebDriver got error: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	//-----------------Wait for control----------------
	public static void waitForControl(String[] element, long timeout) {
		waitForControl(getElement(element), timeout);
	}
	
	public static void waitForControl(String[] element) {
		waitForControl(getElement(element));
	}
	
	private static void waitForControl(By element, long timeout) {				
		try {
			WebDriverWait wait = new WebDriverWait(QTiumAutomation.getDriver(), timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(element))	;		
		} catch (Exception e) {
			log.debug("waitForControl:" + e.getMessage());			
		}		
	}

	private static void waitForControl(By element) {		
		int timeout = QTiumSetting.getElementWait();
		waitForControl(element, timeout);		
	}
	
	//---------------Wait for control close-------------------------
	public static void waitForControlClose(String[] element,long timeout) {
		waitForControlClose(getElement(element),timeout);
	}
	public static void waitForControlClose(String[] element) {
		waitForControlClose(getElement(element));
	}
	private static void waitForControlClose(By element) {
		int timeout = QTiumSetting.getElementWait();
		try {
			WebDriverWait wait = new WebDriverWait(QTiumAutomation.getDriver(), timeout);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
		} catch (Exception e) {
			log.debug("waitForControlClose:" + e.getMessage());
		}
	}
	private static void waitForControlClose(By element, long timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(QTiumAutomation.getDriver(), timeout);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
		} catch (Exception e) {
			log.debug("waitForControlClose:" + e.getMessage());
		}
	}
	
	//---------------Is Page Displayed-------------------------
	public static boolean isPageDisplayed(String pageTitle) {		
		boolean isExist = false;
		long timeout = QTiumSetting.getObjecWait()*1000;
		try {
			QTiumAutomation.getDriver().manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
			String title = QTiumAutomation.getDriver().getTitle();			
			long getTickCount = System.currentTimeMillis();
			while (!title.equals(pageTitle)) {
				Thread.sleep(50);
				title = QTiumAutomation.getDriver().getTitle();
				if ((System.currentTimeMillis()-getTickCount) > timeout) {
					break;
				}
			}
			if (title.equals(pageTitle)) isExist = true;
		} catch (Exception e) {
			isExist = false;
			System.err.println("isPageDisplayed: title=" + pageTitle + " - message: " + e.getMessage());
		}
		System.out.println("isPageDisplayed - pageTitle: " + pageTitle + " >> " + isExist + " .." + Thread.currentThread().getId());
		return isExist;
	}

    //---------------Is Page Displayed-------------------------
    public static String getPageUrl() {
        long timeout = QTiumSetting.getObjecWait()*1000;
        String url = "";
        try {
            QTiumAutomation.getDriver().manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
            url = QTiumAutomation.getDriver().getCurrentUrl();
        } catch (Exception e) {
            System.err.println("Cannot get page url: " + e.getMessage());
        }
        return url;
    }

	//---------------Enter-------------------------
	public static void enter(String[] element, String value)
	{
		enter(getElement(element),value);
	}

	private static void enter(By element, String value) {
		waitForControl(element);
		WebElement webElement = QTiumAutomation.getDriver().findElement(element);
		
		if(webElement == null){
			System.out.println("....enter - element: " + element.toString() + " - value: " + value);
		}
		webElement.clear();
		webElement.sendKeys(value);
	}

	//---------------Is Element Exists-------------------------
	public static boolean isElementExists(String[] element)
	{
		return isElementExists(getElement(element));
	}
	private static boolean isElementExists(By element)
	{
		waitForControl(element);
		try {
			if(QTiumAutomation.getDriver().findElement(element) !=null)
				return true;
			else
				return false;
		} catch (Exception e) {
			log.debug("isElementExists:" + e.getMessage());
			return false;
		}
	}
	
	//---------------isElementDisplayed-------------------------
	public static boolean isElementDisplayed(String[] element) {
		return isElementDisplayed(getElement(element));
	}
	private static boolean isElementDisplayed(By element) {
		boolean isDisplayed = false;		
		if(isElementExists(element))
		{
			try {
				isDisplayed = QTiumAutomation.getDriver().findElement(element).isDisplayed();
			} catch (Exception e) {
				log.debug("isElementDisplayed:" + e.getMessage());
			}
		}
		return isDisplayed;
	}
	
	//---------------clickByJS-------------------------
	public static void clickByJS(String[] element)
	{
		clickByJS(getElement(element));
	}
	private static void clickByJS(By element)
	{		
		waitForControl(element);
		((JavascriptExecutor)QTiumAutomation.getDriver()).executeScript("arguments[0].click();", QTiumAutomation.getDriver().findElement(element));
	}
	
	//---------------click-------------------------
	public static void click(String[] element) {
		click(getElement(element));
	}
	private static void click(By element) {
		waitForControl(element);		
		WebElement webElement = QTiumAutomation.getDriver().findElement(element);		
		System.out.println(">>> click: webElement: " + (webElement != null));		
		try
		{
			WebDriverWait wait = new WebDriverWait(QTiumAutomation.getDriver(), QTiumSetting.getElementWait());
			wait.until(ExpectedConditions.elementToBeClickable(element));
			webElement.click();
		}
		catch(ElementNotVisibleException ex)
		{						
			System.err.println("click - error: " + ex.getMessage());
			clickByJS(element);
		}
	}
	
	//---------------select-------------------------
	public static void select(String[] element, String value) {
		select(getElement(element), value);
	}
	private static void select(By element, String value) {
		waitForControl(element);
		Select select = new Select(QTiumAutomation.getDriver().findElement(element));
		select.selectByValue(value);		
	}
	
	//---------------selectByVisibleText-------------------------
	public static void selectByVisibleText(String[] element, String text) {
		selectByVisibleText(getElement(element), text);
	}
	private static void selectByVisibleText(By element, String text) {
		waitForControl(element);
		Select select = new Select(QTiumAutomation.getDriver().findElement(element));
		select.selectByVisibleText(text);		
	}
	
	//---------------findElement-------------------------
	public static WebElement findElement(String[] element) {
		return findElement(getElement(element));
	}
	private static WebElement findElement(By element) {
		waitForControl(element);
		return QTiumAutomation.getDriver().findElement(element);
	}
	
	//---------------findElements-------------------------
	public static List<WebElement> findElements(String[] element) {
		return findElements(getElement(element));
	}
	private static List<WebElement> findElements(By element) {
		waitForControl(element);
		return QTiumAutomation.getDriver().findElements(element);
	}
	
	//---------------getTableCellValue-------------------------
	public static String getTableCellValue(String[] element, int rowIndex,int colIndex) {
		return getTableCellValue(getElement(element),rowIndex,colIndex);
	}
	private static String getTableCellValue(By element, int rowIndex,int colIndex) {
		String sResult = "";
		rowIndex = rowIndex - 1;
		colIndex = colIndex - 1;
		waitForControl(element);
		WebElement tableElement = findElement(element);
		List<WebElement> rows = tableElement.findElements(By.xpath("tbody/tr"));
		if (rowIndex > rows.size())
			return sResult;
		for (int i = 0; i < rows.size(); i++) {
			if (i == rowIndex) {
				WebElement row = rows.get(i);
				List<WebElement> cols = row.findElements(By.xpath("td"));
				if (colIndex > cols.size())
					return sResult;
				for (int j = 0; j < cols.size(); j++) {
					if (j == colIndex) {
						WebElement col = cols.get(j);
						sResult = col.getText();
						break;
					}
				}
				break;
			}
		}

		return sResult;
	}

	//---------------isChecked-------------------------
	public static boolean isChecked(String[] element) {
		return isChecked(getElement(element));
	}
	private static boolean isChecked(By element) {
		waitForControl(element);
		WebElement webElement = QTiumAutomation.getDriver().findElement(element);
		return webElement.isSelected();
	}

	//---------------getSelectedComboboxItemText-------------------------
	public static String getSelectedComboboxItemText(String[] element){
		return getSelectedComboboxItemText(getElement(element));
	}
	private static String getSelectedComboboxItemText(By element)
	{
		String text = "";
		WebElement webElement = findElement(element);
		Select selectedValue = new Select(webElement);
		text = selectedValue.getFirstSelectedOption().getText();		
		return text;
	}
	
	//---------------getText-------------------------
	public static String getText(String[] element){
		return getText(getElement(element));
	}
	private static String getText(By element)
	{
		return findElement(element).getText();
	}
	
	//---------------set-------------------------
	public static void set(String[] element, boolean isCheck) {
		set(getElement(element), isCheck);
	}
	private static void set(By element, boolean isCheck) {
		boolean check = isChecked(element);
		WebElement webElement = findElement(element);
		if ((isCheck && !check) || (!isCheck && check)) {
			webElement.click();
		}
	}
	
	public static void set(String[] element, boolean isCheck, boolean realState) {
		set(getElement(element), isCheck, realState);
	}
	private static void set(By element, boolean isCheck, boolean realState) {
		WebElement webElement = QTiumAutomation.getDriver().findElement(element);
		if ((isCheck && !realState) || (!isCheck && realState)) {
			webElement.click();
		}
	}

	//---------------getAttribute-------------------------
	public static String getAttribute(String[] element, String att) {
		return getAttribute(getElement(element),att);
	}
	private static String getAttribute(By element, String att) {
		waitForControl(element);
		WebElement webElement = QTiumAutomation.getDriver().findElement(element);
		return webElement.getAttribute(att);
	}

	//---------------logReport-------------------------
	public static void logReport(String report,Class<?> cls) {
		Log log = LogFactory.getLog(cls);
		log.info(report);
	}

	//---------------focusElement-------------------------
	public static void focusElement(String[] element){
		focusElement(getElement(element));
	}
	private static void focusElement(By element){
		if(isElementDisplayed(element)){
			QTiumAutomation.getDriver().findElement(element).sendKeys(Keys.NULL);
		}
	}
	
	//---------------close-------------------------
	public static void close(){		
		QTiumDriverManager.closeWebDriver();
	}
	
	//---------------getElement-------------------------
	private static By getElement(String[] input) {
		By by = null;
		try {
			String elementType = input[0];
			String elementValue = input[1];
			if (elementType.toLowerCase() == "id")
				by = By.id(elementValue);
			else if (elementType.toLowerCase() == "name")
				by = By.name(elementValue);
			else if (elementType.toLowerCase() == "xpath")
				by = By.xpath(elementValue);
		} catch (Exception e) {
			System.err.println("getElement:" + input.toString()	+ e.getMessage());
		}
		return by;
	}
	
	public static void sleep(int second)
	{
		try {
			Thread.sleep(second*1000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	}
		
	
	public static void waitForPageLoad(long timeout)
	{
		Object object = ((JavascriptExecutor)getDriver()).executeScript("return document.readyState;");
		long readTime = 0;
		System.out.println("Page Title: "+ getDriver().getTitle()+ "-waitForPageLoad readyState: " + object.toString() + "-readTime: " + readTime +"-timeout: "+timeout );
		while (!object.toString().toLowerCase().trim().equals("complete") && readTime < timeout) {			
			sleep(1);
			readTime = readTime + 1;
			object = ((JavascriptExecutor)getDriver()).executeScript("return document.readyState;");
			System.out.println("Page Title: "+ getDriver().getTitle()+ "-waitForPageLoad readyState: " + object.toString() + "-readTime: " + readTime +"-timeout: "+timeout );
		}
		sleep(1);
	}
	private final static Log log = LogFactory.getLog(QTiumAutomation.class);
}
