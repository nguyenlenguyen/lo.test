package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAutomation;

public class HomePageAction_M extends HomePageAction {
	@Inject private HomePageEntity_M homePageEntity;
	@Inject private TopPageEntity_M topPageEntity;
	@Inject private PointClubPageEntity pointClubPageEntity;

	@Override
	public void GoToSignInPage() {
		QTiumAutomation.click(homePageEntity.SignInLink());
		QTiumAutomation.waitForPageLoad(120);
	}

	@Override
	public void GoToPointClubPage() {		
		QTiumAutomation.click(homePageEntity.SearchButton());
		QTiumAutomation.waitForPageLoad(120);
		QTiumAutomation.click(topPageEntity.MyAccount());		
		QTiumAutomation.click(topPageEntity.PointClubMenu());
		QTiumAutomation.waitForPageLoad(120);
		QTiumAutomation.waitForControl(pointClubPageEntity.Title(), 120);
	}
	
	@Override
	public void GoToMyAccountPage(){
		QTiumAutomation.waitForPageLoad(480);
		QTiumAutomation.click(homePageEntity.UsernameLabel());
			
	}
	
	@Override
	public void GoToMyRakutenPage(){
		QTiumAutomation.click(homePageEntity.SearchButton());
		QTiumAutomation.waitForPageLoad(120);
		QTiumAutomation.click(homePageEntity.UsernameLabel());
		QTiumAutomation.click(homePageEntity.MyRakutenLink());
		QTiumAutomation.waitForPageLoad(120);
    }
}
