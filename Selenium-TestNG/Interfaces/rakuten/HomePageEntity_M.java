package rakuten;

public class HomePageEntity_M extends HomePageEntity {

	@Override
	public String[] SignInLink() {
		return new String[] { "xpath", "//div[@class='login']/a[1]" };
	}
	
	@Override
	public String[] SearchButton() {
        return new String[] { "id", "searchSubmit" };
    }
	
	@Override
	public String[] CloseRegisterDialogIcon() {
		return new String[] { "xpath", "//a[@class='mb-modal-close close-layer']" };
	}
	@Override
	public String[] UsernameLabel(){
		return new String[]{"xpath","//div[@class='login']/a"};
	}
}
