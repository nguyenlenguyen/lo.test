package rakuten;

import com.google.inject.Inject;
import org.testng.annotations.*;
import rakuten.common.Common;
import selenium.helper.GuiceInjection;

@Guice(moduleFactory = GuiceInjection.class)
public class AccountVerification {
	
	@Inject	Common common;
	@Inject
    HomePageAction homePageAction;
	@Inject
    LoginPageAction loginPageAction;
	
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
		homePageAction.OpenHomePage(url);
		homePageAction.GoToSignInPage();
		loginPageAction.Login(username, password);
	}

}
