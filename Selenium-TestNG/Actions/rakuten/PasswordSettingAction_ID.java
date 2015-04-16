package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

public class PasswordSettingAction_ID  extends PasswordSettingAction{
	
	@Inject private PasswordSettingEntity_ID passwordtSettingEntity;
		
	@Override
	public void CheckControlsExist(){
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(passwordtSettingEntity.PasswordSettingLabel()), true);
				
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(passwordtSettingEntity.NewPasswordLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(passwordtSettingEntity.NewPasswordTextbox()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(passwordtSettingEntity.ReEnterNewPasswordLabel()),true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(passwordtSettingEntity.ReEnterNewPasswordTextbox()),true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(passwordtSettingEntity.OldPasswordSaveChangeLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(passwordtSettingEntity.OldPasswordSaveChangeTexbox()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(passwordtSettingEntity.SaveChangeButton()), true);
		
	}
}
