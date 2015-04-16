package rakuten;

import com.google.inject.Inject;
import rakuten.common.Common;

public class LoginPageEntity {
	@Inject
    Common common;

	public String[] UserNameTextBox() {
		return new String[] { "id", "username" };
	}

	public String[] UserNameLabel() {
		return new String[] { "xpath", "//div[@class='b-control-group'][1]/label" };
	}
	
	public String[] PasswordTextBox() {
		return new String[] { "id", "password" };
	}
	
	public String[] PasswordLabel() {
		return new String[] { "xpath", "//div[@class='b-control-group'][2]/label" };
	}

	public String[] SignInButton() { 
		return new String[] { "name", "commit" };
    }
	
	public String[] ForgotYourPasswordLink(){
        String href = "/member/password/inquiry?l-id=" + common.getSiteID() + "_signin_forgot";
		return new String[] {"xpath","//div[@class='b-help-block']/a[contains(@href,'" + href + "')]"};
	}
	
	public String[] MessageLabel(){
		return new String[] {"xpath","//div[@class='b-help-block']/p"};
	}
	
	public String[] LoginTitle(){
		return new String[] {"xpath","//h1[@class='b-ttl-1']"};
	}
	
	public String[] TermsAndConditionsLink(){
		return new String[] {"xpath","//div[@class='b-help-block']/p/a[contains(@href,'condition')]"};
	}
		
	public String[] PrivacyPolicy(){
		return new String[] {"xpath","//div[@class='b-help-block']/p/a[contains(@href,'privacy')]"};
	}	
	
	public String[] BecomeANewMemberLink(){
		return new String[] {"xpath","//div[@class='b-btns-utility']/b/a"};
	}		
	
	
}
