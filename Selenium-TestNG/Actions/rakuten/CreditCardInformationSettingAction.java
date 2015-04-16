package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

public class CreditCardInformationSettingAction {
	
	@Inject private CreditCardInformationEntity creditCardInformationSettingEntity;
		
	 public void verifyCreditCardInformationURL(){
			
			MyAccountAction.checkURLOpened("/member/payments");
		}
	
	
	public void CheckControlsExist(){
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(creditCardInformationSettingEntity.CreditCardInformationLabel()), true);
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(creditCardInformationSettingEntity.AddNewCreditCardButton()), true);
		
		}

	public void AddNewCard(){
		QTiumAutomation.click(creditCardInformationSettingEntity.AddNewCreditCardButton());
		}
	}
