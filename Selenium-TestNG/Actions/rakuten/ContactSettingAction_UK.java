package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

public class ContactSettingAction_UK extends ContactSettingAction {
	
	@Inject private ContactSettingEntity contactSettingEntity;
		
	@Override
	public void CheckControlsExist(){
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(contactSettingEntity.ContactSettingLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(contactSettingEntity.CountryLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(contactSettingEntity.AddressLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(contactSettingEntity.PostalCodeLabel()),true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(contactSettingEntity.CityLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(contactSettingEntity.TelephoneLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(contactSettingEntity.SaveChangeButton()), true);
		
	}
}
