package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

public class PasswordSettingAction {
	
	@Inject private PasswordSettingEntity passwordtSettingEntity;
		
	 public void verifyPasswordSettingURL(){
			
			MyAccountAction.checkURLOpened("/member/setpassword");
		}	
	
	public void CheckControlsExist(){
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(passwordtSettingEntity.PasswordSettingLabel()), true);
				
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(passwordtSettingEntity.NewPasswordLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(passwordtSettingEntity.NewPasswordTextbox()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(passwordtSettingEntity.ReEnterNewPasswordLabel()),true);
		
		QTiumAssert.verifyEquals( QTiumAutomation.isElementExists(passwordtSettingEntity.ReEnterNewPasswordTextbox()),true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(passwordtSettingEntity.ReEnterNewPasswordLabel()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(passwordtSettingEntity.OldPasswordSaveChangeTexbox()), true);
		
		QTiumAssert.verifyEquals(QTiumAutomation.isElementExists(passwordtSettingEntity.SaveChangeButton()), true);
		
	}
}
