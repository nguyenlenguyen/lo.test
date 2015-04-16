package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAutomation;

public class HomePageActionAction_ES extends HomePageAction {
	@Inject private HomePageEntity_ES homePageEntity;

	@Override
    public void OpenHomePage(String url) {
		QTiumAutomation.openURL(url);
		QTiumAutomation.waitForPageLoad(15);				
		if (QTiumAutomation.isElementDisplayed(homePageEntity.RegisterDialog())) {
			QTiumAutomation.click(homePageEntity.CloseRegisterDialogIcon());
			QTiumAutomation.sleep(2);
		}
	}
}
