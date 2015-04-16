package rakuten;

public class HomePageEntity_ES extends HomePageEntity {

    @Override
    public String[] RegisterDialog() { return new String[] { "id", "modalm" };	}

	@Override
	public String[] CloseRegisterDialogIcon() {
		return new String[] { "xpath", "//div[@id='modalm']//a[@class='b-close in-modal']" };
	}

    @Override
    public String[] UserPointsIconM() {
        return new String[] { "xpath", "//i[@class='b-sprite-icon-point-mono']" };
    }

    @Override
    public String[] OpenYourOnlineStoreLink() {
        return new String[] { "xpath", "//a[contains(@href,'/info/vender/?l-id=rakuten_top_header_guide_EC')]" };
    }
}
