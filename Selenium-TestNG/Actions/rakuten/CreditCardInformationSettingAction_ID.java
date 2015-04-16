package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

public class CreditCardInformationSettingAction_ID extends CreditCardInformationSettingAction {
	
	@Inject private CreditCardInformationEntity_ID creditCardInformationSettingEntity;
		
	@Override
	public void CheckControlsExist(){
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(creditCardInformationSettingEntity.CreditCardInformationLabel()), true);
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(creditCardInformationSettingEntity.AddNewCreditCardButton()), true);
		
		
	}

}
