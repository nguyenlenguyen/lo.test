package rakuten;

public class HomePageEntity_TW extends HomePageEntity {

	@Override
	public String[] SignInLink() {
		return new String[] { "id", "Login" };
	}
	
	public String[] PointClubLink() {
		return new String[] { "xpath", "//div[@class='memberData']/ul/li[2]/a" };
	}
	
	public String[] PointClubHomePage(){
		return new String[] {"id", "point2"};
	}
}
