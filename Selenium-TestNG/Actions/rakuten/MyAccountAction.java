package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

public class MyAccountAction {
	
@Inject AccountSettingEntity accountSettingEntity;

public static void checkURLOpened(String url){

	String strCurrentURL = QTiumAutomation.getDriver().getCurrentUrl();
	boolean isContain = strCurrentURL.contains(url);
	QTiumAssert.verifyTrue(isContain);
}

public void SelectMenu(String menu){
	if (menu == "Account Setting"){
	QTiumAutomation.click(accountSettingEntity.ContactSettingMenu());
	}
	if (menu =="Contact Setting"){
		QTiumAutomation.click(accountSettingEntity.ContactSettingMenu());
	}
	if(menu =="Password Setting"){
		QTiumAutomation.click(accountSettingEntity.PasswordSettingMenu());
	}
	if(menu =="CreditCard Information"){
		QTiumAutomation.click(accountSettingEntity.CreditCardInformationMenu());
	}
	if(menu=="Cancel Membership"){
		QTiumAutomation.click(accountSettingEntity.CancelMemberShipMenu());
	}
}
}
