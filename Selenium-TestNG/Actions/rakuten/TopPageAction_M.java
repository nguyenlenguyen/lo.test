package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAutomation;

public class TopPageAction_M extends TopPageAction {
	@Inject	private HomePageEntity_M homePageEntity;
    @Inject	private TopPageEntity_M topPageEntity;

    @Override
	public void SignOut(){
    	QTiumAutomation.click(homePageEntity.SearchButton());
		QTiumAutomation.waitForPageLoad(120);
		QTiumAutomation.click(topPageEntity.MyAccount());
		QTiumAutomation.click(topPageEntity.SignOutMenu());
		QTiumAutomation.waitForPageLoad(120);
	}
}
