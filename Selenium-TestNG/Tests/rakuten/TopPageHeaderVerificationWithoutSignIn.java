package rakuten;

import com.google.inject.Inject;
import org.testng.annotations.*;
import rakuten.common.Common;
import selenium.helper.GuiceInjection;

@Guice(moduleFactory = GuiceInjection.class)
public class TopPageHeaderVerificationWithoutSignIn {
	
	@Inject	Common common;
    @Inject HomePageAction homePageAction;

	@BeforeClass
	public void setUp() {
		common.Config();
	}
	
	@AfterMethod()
	public void tearDown() {
		common.CloseBrowser();
	}
	
	@Parameters({ "url" })
	@Test(description = "Verify controls on the header of the page without signing in")
	public void TC01_TopPageHeaderVerificationWithoutSignIn(String url) {
        homePageAction.OpenHomePage(url);
        homePageAction.VerifyControlsOnHeader();
	}
}
