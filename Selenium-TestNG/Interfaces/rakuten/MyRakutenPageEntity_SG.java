package rakuten;

public class MyRakutenPageEntity_SG extends MyRakutenPageEntity {

    // Point Club section
	@Override
    public String[] PointClubTermConditions() {
        return new String[] { "xpath", "(//a[contains(@href,'-Terms-and-Conditions')])[1]" };
    }

    // Member Information section
    @Override
    public String[] MemberInformationTermConditions() {
        return new String[] { "xpath", "(//a[contains(@href,'-Terms-and-Conditions')])[2]" };
    }

    // FAQ
    @Override
    public String[] ShoppingFAQ() {
        return new String[] { "xpath", "//a[contains(@href,'-Order')]" };
    }
    @Override
    public String[] MembershipFAQ() {
        return new String[] { "xpath", "//a[contains(@href,'-Membership')]" };
    }
    @Override
    public String[] RakutenSuperPointFAQ() {
        return new String[] { "xpath", "//a[contains(@href,'-Rakuten-Super-Points')]" };
    }
}