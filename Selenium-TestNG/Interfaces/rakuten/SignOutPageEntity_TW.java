package rakuten;

public class SignOutPageEntity_TW extends SignOutPageEntity{
	
	@Override
	public String[] SignOut(){
		return new String[] {"xpath", "//p[@class='message']"};
	}
}
