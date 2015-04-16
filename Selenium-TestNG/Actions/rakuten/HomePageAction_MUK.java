package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAutomation;

public class HomePageAction_MUK extends HomePageAction {
	@Inject private HomePageEntity_MUK homePageEntity;
	@Inject private TopPageEntity_M topPageEntity;
	@Inject private PointClubPageEntity pointClubPageEntity;

	@Override
	public void GoToSignInPage() {
		QTiumAutomation.click(topPageEntity.MyAccount());	
		QTiumAutomation.click(homePageEntity.SignInLink());		
		QTiumAutomation.waitForPageLoad(120);
	}

	@Override
	public void GoToPointClubPage() {		
		QTiumAutomation.click(topPageEntity.MyAccount());		
		QTiumAutomation.click(topPageEntity.PointClubMenu());
		QTiumAutomation.waitForPageLoad(120);
		QTiumAutomation.waitForControl(pointClubPageEntity.Title(), 120);
	}	
}
