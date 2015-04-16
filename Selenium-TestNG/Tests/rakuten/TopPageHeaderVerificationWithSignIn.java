package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;
import org.testng.annotations.*;
import rakuten.common.Common;
import selenium.helper.GuiceInjection;

@Guice(moduleFactory = GuiceInjection.class)
public class TopPageHeaderVerificationWithSignIn {
	
	@Inject	Common common;
    @Inject HomePageEntity homePageEntity;
    @Inject HomePageAction homePageAction;
    @Inject LoginPageEntity loginPageEntity;
    @Inject LoginPageAction loginPageAction;

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
	public void TC01_TopPageHeaderVerificationWithSignIn(String url, String username, String password) {
        homePageAction.OpenHomePage(url);

        String verifyURL =
                common.getSecureUrl() + "/member/signin?service_id=Top&return_url=http:%2F%2F"
                + url.replace("http://", "").replace("/","") + "%2F&l-id=" + common.getSiteID()
                + "_rakuten_top_header_member_signIn";
        QTiumAutomation.click(homePageEntity.SignInLink());
        QTiumAssert.verifyTrue(QTiumAutomation.getPageUrl().contains(verifyURL));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(loginPageEntity.ForgotYourPasswordLink()));

        loginPageAction.Login(username, password);
        QTiumAssert.verifyEquals(QTiumAutomation.getPageUrl(), url + "/");
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(homePageEntity.UsernameLabel()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(homePageEntity.UserPointsLink()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(homePageEntity.UserPointsIconM()));
	}
}