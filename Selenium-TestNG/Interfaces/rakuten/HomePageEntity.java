package rakuten;

import com.google.inject.Inject;
import rakuten.common.Common;

public class HomePageEntity {

    @Inject
    Common common;

	public String[] SignInLink() {
		return new String[] { "id", "auto_sign_in" };
	}

    public String[] RegisterLink() {
        return new String[] { "id", "auto_register" };
    }

    public String[] CartIcon() {
        return new String[] { "id", "auto_member_cart" };
    }

	public String[] RegisterDialog() { return new String[] { "id", "modalm" };	}

	public String[] CloseRegisterDialogIcon() {
		return new String[] { "xpath", "//div[@id='modalm']/div/div/a[@class='b-close in-modal']" };
	}
	
	public String[] ClosePopupIcon() {
		return new String[] { "id", "popclose" };
	}

    public String[] UsernameLabel() {
        return new String[] { "id", "auto_login_member" };
    }

    public String[] UserPointsLink() {
        return new String[] { "xpath", "//a[contains(@href,'/point/?l-id=" + common.getSiteID() + "_top_point')]" };
    }

    public String[] UserPointsIconM() {
        return new String[] { "xpath", "//i[@class='b-sprite-rank-mini-member']" };
    }

    public String[] MyRakutenLink() {
        return new String[] { "id", "auto_myrakuten" };
    }

    public String[] RakutenLogo() {
        return new String[] { "xpath", "//a[contains(@href,'top_header_logo')]" };
    }

    public String[] RakutenSuperPointsLink() {
        return new String[] { "xpath", "//a[contains(@href,'/help/guide/point/?l-id=rakuten_top_header_guide_superPoints')]" };
    }

    public String[] ShoppingGuideLink() {
        return new String[] { "xpath", "//a[contains(@href,'/help/guide/?l-id=rakuten_top_header_guide_shoppingGuide')]" };
    }

    public String[] OpenYourOnlineStoreLink() {
        return new String[] { "xpath", "//a[contains(@href,'/info/ec/?l-id=rakuten_top_header_guide_EC')]" };
    }

    public String[] CategoriesComboBox() {
        return new String[] { "xpath", "//*[@id='search_header_category']" };
    }

    public String[] SearchTextBox() {
        return new String[] { "id", "k" };
    }
    
    public String[] SearchButton() {
        return new String[] { "id", "header_search_btn" };
    }
}
