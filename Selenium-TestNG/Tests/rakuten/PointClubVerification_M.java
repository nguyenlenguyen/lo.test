package rakuten;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Guice;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.inject.Inject;

import rakuten.common.Common;
import selenium.helper.GuiceInjection;

@Guice(moduleFactory = GuiceInjection.class)
	public class PointClubVerification_M {
		@Inject	Common common;
		@Inject
	    HomePageAction homePageAction;
		@Inject
	    TopPageAction topPageAction;
		@Inject
	    LoginPageAction loginPageAction;
		@Inject
		PointClubPageAction pointClubPageAction;	
		
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
		public void TC_Point_Club_Verification(String url, String username, String password) throws BiffException, IOException {																	
			homePageAction.OpenHomePage(url);
			homePageAction.GoToSignInPage();
			loginPageAction.Login(username, password);			
			homePageAction.GoToPointClubPage();		
			String pointClubValue = topPageAction.GetPointClubValue();
			pointClubPageAction.VerifyPageUI();
			pointClubPageAction.VerifyLanguage(url);
			pointClubPageAction.VerifyPointTotalIsSamePointTopBar(pointClubValue);
		}
}
