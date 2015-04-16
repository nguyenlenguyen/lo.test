package rakuten;

public class HomePageEntity_MUK extends HomePageEntity {

	@Override
	public String[] SignInLink() {
		return new String[] { "xpath", "//button[contains(@ng-click,'filter')]" };
	}
	
	@Override
	public String[] SearchButton() {
        return new String[] { "id", "searchSubmit" };
    }
	
	@Override
	public String[] CloseRegisterDialogIcon() {
		return new String[] { "xpath", "//a[@class='mb-modal-close close-layer']" };
	}
}
