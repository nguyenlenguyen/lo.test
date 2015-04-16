package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAutomation;

public class TopPageAction {
    @Inject	private TopPageEntity topPageEntity;

	public void SignOut(){
		QTiumAutomation.click(topPageEntity.LoginMemberTop());
		QTiumAutomation.click(topPageEntity.SignOutTop());
		QTiumAutomation.waitForPageLoad(15);
	}
	
	public String GetPointClubValue(){
    	return QTiumAutomation.getText(topPageEntity.PointClubTop());
    }
}
