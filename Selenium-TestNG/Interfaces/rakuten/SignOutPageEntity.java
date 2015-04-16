package rakuten;

public class SignOutPageEntity {	
	public String[] SignOut(){
		return new String[] {"xpath", "//div[@class='b-mod-panel b-color-safe b-text-safe b-left']/p/em"};
	}
	
	public String[] UserName() {
		return new String[] { "id", "username" };
	}

	public String[] UserNameLabel() {
		return new String[] { "xpath", "//div[@class='b-control-group'][1]/label" };
	}
	
	public String[] Password() {
		return new String[] { "id", "password" };
	}
	
	public String[] PasswordLabel() {
		return new String[] { "xpath", "//div[@class='b-control-group'][2]/label" };
	}

	public String[] SignIn() { 
		return new String[] { "name", "commit" };
    }
	
	public String[] ForgotYourPassword(){
		return new String[] {"xpath","//div[@class='b-help-block']/a[contains(@href,'signin_forgot')]"};
	}
	
	public String[] Message(){
		return new String[] {"xpath","//div[@class='b-help-block']/p"};
	}
	
	public String[] Title(){
		return new String[] {"xpath","//h1[@class='b-ttl-1']"};
	}
	
	public String[] TermsAndConditions(){
		return new String[] {"xpath","//div[@class='b-help-block']/p/a[contains(@href,'condition')]"};
	}
		
	public String[] PrivacyPolicy(){
		return new String[] {"xpath","//div[@class='b-help-block']/p/a[contains(@href,'privacy')]"};
	}	
	
	public String[] BecomeANewMember(){
		return new String[] {"xpath","//div[@class='b-btns-utility']/b/a"};
	}		
}
