package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

public class AccountSettingAction_ID extends AccountSettingAction{
	
	@Inject private AccountSettingEntity_ID accountSettingEntity;

	@Override
	public void CheckControlsExist(){
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(accountSettingEntity.AccountSettingLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(accountSettingEntity.FirstNameLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(accountSettingEntity.EmailLabel()),true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(accountSettingEntity.UserIDLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(accountSettingEntity.UserIDUserEmailRadio()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(accountSettingEntity.UserIDUuseAddAUserIDRadio()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(accountSettingEntity.UserNameTextbox()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(accountSettingEntity.GenderLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(accountSettingEntity.BirthdayLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(accountSettingEntity.ProfileSaveChangeButton()), true);
		
		}
}
