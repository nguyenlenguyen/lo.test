package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

public class CreditCardInformationSettingAction_ES extends CreditCardInformationSettingAction {
	
	@Inject private CreditCardInformationEntity_ES creditCardInformationSettingEntity;
		
	@Override
	public void CheckControlsExist(){
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(creditCardInformationSettingEntity.CreditCardInformationLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(creditCardInformationSettingEntity.AddNewCreditCardButton()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(creditCardInformationSettingEntity.VisaLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(creditCardInformationSettingEntity.CardNumberLabel()), true);
				
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(creditCardInformationSettingEntity.EditCardLink()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(creditCardInformationSettingEntity.DeleteCardLink()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(creditCardInformationSettingEntity.CardExpirationDateLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(creditCardInformationSettingEntity.CardHolderNameLabel()), true);
	
	}

}
