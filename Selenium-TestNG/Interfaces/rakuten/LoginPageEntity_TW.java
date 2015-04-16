package rakuten;

public class LoginPageEntity_TW extends LoginPageEntity {

	@Override
	public String[] UserNameTextBox() {
		return new String[] { "xpath", "//input[@id='loginInner' and @type='text']" };
	}
	
	@Override
	public String[] PasswordTextBox() {
		return new String[] { "xpath", "//input[@id='loginInner' and @type='password']" };
	}
	
	public String[] SignInButton() { 
		return new String[] { "xpath", "//input[@type='submit']" };
    }
}
