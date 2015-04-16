package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

public class CreditCardInformationSetting_MY extends CreditCardInformationSettingAction {
	
	@Inject private CreditCardInformationEntity creditCardInformationSettingEntity;
	
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
