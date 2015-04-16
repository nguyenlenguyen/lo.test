package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAutomation;

public class HomePageAction_TW extends HomePageAction {	
	@Inject private HomePageEntity_TW homePageEntity;
	@Inject private PointClubPageEntity_TW pointClubPageEntity;
	
	@Override
	public void GoToPointClubPage() {
		QTiumAutomation.click(homePageEntity.PointClubLink());
		QTiumAutomation.waitForPageLoad(30);
		QTiumAutomation.waitForControl(pointClubPageEntity.Title());
	}
	
	@Override
	public String GetPointClubValue(){
		return QTiumAutomation.getText(homePageEntity.PointClubHomePage()).replaceAll("[^-?0-9]+", "");		
	}
}
