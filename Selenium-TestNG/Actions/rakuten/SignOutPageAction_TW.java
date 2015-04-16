package rakuten;

import java.io.IOException;

import jxl.read.biff.BiffException;
import rakuten.util.ExcelUtil;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

public class SignOutPageAction_TW extends SignOutPageAction{
    @Inject	private SignOutPageEntity_TW signOutPageEntity;
	
	@Override
	public void VerifyPageUI() {
		QTiumAssert.verifyTrue(QTiumAutomation.isElementExists(signOutPageEntity.SignOut()));		
	}
	
	@Override
	public void VerifyUrl(String rootUrl){
		String expectedUrl = rootUrl.replace("http://www.", "https://member.id.") + "/id/menu/logout";
		QTiumAssert.verifyEquals(QTiumAutomation.getPageUrl(), expectedUrl);		
	}
	
	public void VerifyLanguage(String url) throws BiffException, IOException{	
		String languageType = url.substring(url.lastIndexOf('.') + 1);
		String expectedSignOutMessage = getTextByLanguage("You're logged out!_key", languageType);				 
		String actualSignOutMessage = QTiumAutomation.getText(signOutPageEntity.SignOut());		 		 
		QTiumAssert.verifyEquals(actualSignOutMessage, expectedSignOutMessage);	
	 }	 		
	 
	 public String getTextByLanguage(String key, String languageType) throws BiffException, IOException{
		 return ExcelUtil.getCellValue("Data\\rakuten\\LanguageData.xls", "LanguageData", key, languageType);		 
	 }
}
