package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAutomation;

public class TopPageAction_TW extends TopPageAction {
    @Inject	private TopPageEntity_TW topPageEntity;

    @Override
	public void SignOut(){				
		QTiumAutomation.click(topPageEntity.SignOutTop());
		QTiumAutomation.waitForPageLoad(15);
	}
}
