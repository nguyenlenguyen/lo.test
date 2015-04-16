package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAutomation;

public class LoginPageAction {
    @Inject	private LoginPageEntity loginPageEntity;

	public void Login(String username, String password) {		
		QTiumAutomation.waitForControl(loginPageEntity.UserNameTextBox(), 30);
		QTiumAutomation.enter(loginPageEntity.UserNameTextBox(), username);
		QTiumAutomation.enter(loginPageEntity.PasswordTextBox(), password);
		QTiumAutomation.click(loginPageEntity.SignInButton());
		QTiumAutomation.waitForPageLoad(120);
	}
}
