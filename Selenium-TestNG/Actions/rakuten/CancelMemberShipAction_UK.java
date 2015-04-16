package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

public class CancelMemberShipAction_UK extends CancelMemberShipAction {
	
	@Inject private CancelMemberShipEntity_UK cancelMemberShipEntity;
	
	@Override
	public void CheckControlsExist(){
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(cancelMemberShipEntity.CancelMemberShipLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(cancelMemberShipEntity.OnYouCancelLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(cancelMemberShipEntity.ViewInAWindowLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(cancelMemberShipEntity.WeSorryLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(cancelMemberShipEntity.UserIDLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(cancelMemberShipEntity.PasswordLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(cancelMemberShipEntity.PasswordTextbox()), true);

		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(cancelMemberShipEntity.IHaveReviewCheckbox()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(cancelMemberShipEntity.CancelMemberShipButton()), true);
		
	}

}
