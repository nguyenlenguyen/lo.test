package rakuten;

import com.google.inject.Inject;
import rakuten.common.Common;

public class MyRakutenPageEntity {
    @Inject Common common;

    // Point Club section
	public String[] PointInformation() {
		return new String[] { "xpath", "(//a[@href='" + common.getSecureUrl() + "/point/'])[1]" };
	}
    public String[] PointHistory() {
        return new String[] { "xpath", "//a[@href='" + common.getSecureUrl() + "/point/#transactions']" };
    }
    public String[] WhatIsRakutenSuperPoints() {
        return new String[] { "xpath", "//a[@href='" + common.getBaseUrl() + "/help/guide/point/']" };
    }
    public String[] PointClubTermConditions() {
        return new String[] { "xpath", "(//a[@href='" + common.getBaseUrl() + "/policy/terms_conditions/'])[1]" };
    }

    // Member Information section
    public String[] WhatIsMembership() {
        return new String[] { "xpath", "//a[@href='" + common.getBaseUrl() + "/help/guide/member/']" };
    }
    public String[] AccountSettings() {
        return new String[] { "xpath", "//a[@href='" + common.getSecureUrl() + "/member/profile/']" };
    }
    public String[] CreditCardInformation() {
        return new String[] { "xpath", "//a[@href='" + common.getSecureUrl() + "/member/payments/']" };
    }
    public String[] ChangePassword() {
        return new String[] { "xpath", "//a[@href='" + common.getSecureUrl() + "/member/setpassword/']" };
    }
    public String[] MemberInformationTermConditions() {
        return new String[] { "xpath", "(//a[@href='" + common.getBaseUrl() + "/policy/terms_conditions/'])[2]" };
    }
    public String[] CancelMembership() {
        return new String[] { "xpath", "//a[@href='" + common.getSecureUrl() + "/member/cancel/']" };
    }

    // My Shopping section
    public String[] MyCart() {
        return new String[] { "xpath", "//a[@href='" + common.getBaseUrl() + "/cart']" };
    }
    public String[] MyOrders() {
        return new String[] { "xpath", "//a[@href='" + common.getSecureUrl() + "/order/list/']" };
    }
    public String[] MyRecentlyViewedProducts() {
        return new String[] { "xpath", "//a[@href='" + common.getBaseUrl() + "/browsing_history/']" };
    }
    public String[] MyWishList() {
        return new String[] { "xpath", "//a[@href='" + common.getBaseUrl() + "/wishlist/']" };
    }
    public String[] MyMessages() {
        return new String[] { "xpath", "//a[@href='" + common.getSecureUrl() + "/messages/']" };
    }

    // FAQ
    public String[] ShoppingGuide() {
        return new String[] { "xpath", "//a[@href='" + common.getBaseUrl() + "/help/guide/']" };
    }
    public String[] GeneralFAQ() {
        return new String[] { "xpath", "//a[@href='" + common.getBaseUrl() + "/help/faq/']" };
    }
    public String[] ShoppingFAQ() {
        return new String[] { "xpath", "//a[@href='" + common.getBaseUrl() + "/help/faq/shopping/']" };
    }
    public String[] MembershipFAQ() {
        return new String[] { "xpath", "//a[@href='" + common.getBaseUrl() + "/help/faq/member/']" };
    }
    public String[] RakutenSuperPointFAQ() {
        return new String[] { "xpath", "//a[@href='" + common.getBaseUrl() + "/help/faq/point/']" };
    }
}
