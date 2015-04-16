package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

public class AddNewCardAction_ES extends AddNewCardAction {
	
	@Inject private AddNewCardEntity_ES addNewCardEntity;
		
	@Override
	public void CheckControlsExist(){
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(addNewCardEntity.AddAnewCardLabel()),true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(addNewCardEntity.CardNumberLabel()),true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(addNewCardEntity.MasterCardIconImage()),true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(addNewCardEntity.VisaCardIconImage()),true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(addNewCardEntity.CardExpirationDateLabel()),true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(addNewCardEntity.CardExpirationMonthCombobx()),true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(addNewCardEntity.CardExpirationYearCombobox()),true);

		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(addNewCardEntity.CardHolderNameLabel()),true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(addNewCardEntity.MakeThisCardCheckbox()),true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(addNewCardEntity.AddCardButton()),true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(addNewCardEntity.AddCancelButton()),true);
	}

}
