package rakuten;

import java.io.IOException;

import jxl.read.biff.BiffException;
import rakuten.util.ExcelUtil;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

public class SignOutPageAction {
    @Inject	private SignOutPageEntity signOutPageEntity;
    @Inject	private TopPageEntity topPageEntity;

	public void LoginFromSignOutPage(String username, String password) {
		QTiumAutomation.waitForPageLoad(15);
		QTiumAutomation.waitForControl(signOutPageEntity.UserName(), 30);
		QTiumAutomation.enter(signOutPageEntity.UserName(), username);
		QTiumAutomation.enter(signOutPageEntity.Password(), password);
		QTiumAutomation.click(signOutPageEntity.SignIn());
		QTiumAutomation.waitForControl(topPageEntity.LoginMemberTop(), 30);
	}
	
	public void VerifyPageUI(){
		QTiumAssert.verifyTrue(QTiumAutomation.isElementExists(signOutPageEntity.SignOut()));
		QTiumAssert.verifyTrue(QTiumAutomation.isElementExists(signOutPageEntity.Title()));
		QTiumAssert.verifyTrue(QTiumAutomation.isElementExists(signOutPageEntity.UserName()));
		QTiumAssert.verifyTrue(QTiumAutomation.isElementExists(signOutPageEntity.Password()));		
		QTiumAssert.verifyTrue(QTiumAutomation.isElementExists(signOutPageEntity.ForgotYourPassword()));
		QTiumAssert.verifyTrue(QTiumAutomation.isElementExists(signOutPageEntity.Message()));
		QTiumAssert.verifyTrue(QTiumAutomation.isElementExists(signOutPageEntity.TermsAndConditions()));
		QTiumAssert.verifyTrue(QTiumAutomation.isElementExists(signOutPageEntity.PrivacyPolicy()));
		QTiumAssert.verifyTrue(QTiumAutomation.isElementExists(signOutPageEntity.BecomeANewMember()));
		QTiumAssert.verifyTrue(QTiumAutomation.isElementExists(signOutPageEntity.SignIn()));
	}
	
	public void VerifyUrl(String rootUrl){
		String expectedUrl = rootUrl.replace("http://www.", "https://secure.") + "/member/signin?service_id=Member";
		QTiumAssert.verifyEquals(QTiumAutomation.getPageUrl(), expectedUrl);		
	}
	
	public void VerifyLanguage(String url) throws BiffException, IOException{
		 String languageType = url.substring(url.lastIndexOf('.') + 1);	
		 String expectedSignOutMessage = getTextByLanguage("You're logged out!_key", languageType);
		 String expectedRakutenMembers = getTextByLanguage("Rakuten Members_key", languageType);
		 String expectedUserID = getTextByLanguage("User ID_key", languageType);
		 String expectedPassword = getTextByLanguage("Password_key", languageType);
		 String expectedSignIn = getTextByLanguage("Sign In_key", languageType);
		 String expectedBecomeANewMember = getTextByLanguage("Become a New Member_Key", languageType);
		 String expectedTermsAndConditions = getTextByLanguage("Terms and Conditions_key", languageType);
		 String expectedPrivacyPolicy = getTextByLanguage("Privacy Policy_key", languageType);
		 String expectedForgotYourPassword = getTextByLanguage("Forgot your password?_key", languageType);
		 
		 String actualSignOutMessage = QTiumAutomation.getText(signOutPageEntity.SignOut());
		 String actualRakutenMembers = QTiumAutomation.getText(signOutPageEntity.Title());
		 String actualUserID = QTiumAutomation.getText(signOutPageEntity.UserNameLabel());
		 String actualPassword = QTiumAutomation.getText(signOutPageEntity.PasswordLabel());
		 String actualSignIn = QTiumAutomation.getAttribute(signOutPageEntity.SignIn(), "value");
		 String actualBecomeANewMember = QTiumAutomation.getText(signOutPageEntity.BecomeANewMember()); 
		 String actualTermsAndConditions = QTiumAutomation.getText(signOutPageEntity.TermsAndConditions()); 
		 String actualPrivacyPolicy = QTiumAutomation.getText(signOutPageEntity.PrivacyPolicy()); 
		 String actualForgotYourPassword = QTiumAutomation.getText(signOutPageEntity.ForgotYourPassword()); 
		 
		 QTiumAssert.verifyEquals(actualSignOutMessage, expectedSignOutMessage);
		 QTiumAssert.verifyEquals(actualRakutenMembers, expectedRakutenMembers);
		 QTiumAssert.verifyEquals(actualUserID, expectedUserID);
		 QTiumAssert.verifyEquals(actualPassword, expectedPassword);
		 QTiumAssert.verifyEquals(actualSignIn, expectedSignIn);
		 QTiumAssert.verifyEquals(actualBecomeANewMember, expectedBecomeANewMember);
		 QTiumAssert.verifyEquals(actualTermsAndConditions, expectedTermsAndConditions);
		 QTiumAssert.verifyEquals(actualPrivacyPolicy, expectedPrivacyPolicy);
		 QTiumAssert.verifyEquals(actualForgotYourPassword, expectedForgotYourPassword);
	 }	 		
	 
	 public String getTextByLanguage(String key, String languageType) throws BiffException, IOException{
		 return ExcelUtil.getCellValue("Data\\rakuten\\LanguageData.xls", "LanguageData", key, languageType);		 
	 }
}
