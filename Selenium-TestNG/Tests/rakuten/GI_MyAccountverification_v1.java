package rakuten;

import com.google.inject.Inject;
import org.testng.annotations.*;
import rakuten.common.Common;
import selenium.helper.GuiceInjection;

@Guice(moduleFactory = GuiceInjection.class)

public class GI_MyAccountverification_v1 {
	
	@Inject	Common common;
	@Inject
    HomePageAction homePage;
	@Inject
    LoginPageAction loginPage;
	@Inject
	MyAccountAction myAccount;
	@Inject
	AccountSettingAction accountSetting;
	@Inject
	ContactSettingAction contactSetting;
	@Inject
	PasswordSettingAction passwordSetting;
    @Inject
    CreditCardInformationSettingAction creditCardInformation;
	@Inject
	AddNewCardAction addNewCard;
	@Inject
	CancelMemberShipAction cancelMemberShip;
	
	@BeforeClass
	public void setUp() {
		common.Config();
	}
	
	@AfterMethod()
	public void tearDown() {
		common.CloseBrowser();
	}
	@Parameters({ "url", "username", "password" })
	@Test(description = "Open My Account")
	public void TC001_Open_My_Account(String url, String username, String password) {
		homePage.OpenHomePage(url);
		homePage.GoToSignInPage();
		loginPage.Login(username, password);
		homePage.GoToMyAccountPage();
	//	accountSetting.verifyAccountSettingURL();
		accountSetting.CheckControlsExist();
		/*myAccount.SelectMenu("Contact Setting");
		contactSetting.verifyContactSettingURL();
		contactSetting.CheckControlsExist();
	    myAccount.SelectMenu("Password Setting");
	    passwordSetting.verifyPasswordSettingURL();
	    passwordSetting.CheckControlsExist();
	    myAccount.SelectMenu("CreditCard Information");
	    creditCardInformation.verifyCreditCardInformationURL();
	    creditCardInformation.CheckControlsExist();
	    creditCardInformation.AddNewCard();
	    addNewCard.verifyAddNewCardURL();
	    addNewCard.CheckControlsExist();
	    myAccount.SelectMenu("Cancel Membership");
	    cancelMemberShip.verifyCancelMemberShipURL();
	    cancelMemberShip.CheckControlsExist();*/
		
	}

}
