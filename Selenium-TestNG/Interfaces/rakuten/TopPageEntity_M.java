package rakuten;

public class TopPageEntity_M extends TopPageEntity {
	@Override	
	public String[] MyAccount(){
		return new String[] {"xpath","//div[@class='me-container']"};
	}
	
	public String[] PointClubMenu(){
		return new String[] {"xpath", "//a[contains(@href,'/point') and @class='ng-binding']"};
	}
	
	public String[] SignOutMenu(){
		return new String[] {"xpath", "//span[@class='signOut']"};
	}
}
