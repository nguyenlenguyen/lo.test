package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

public class MyRakutenPageAction {
    @Inject	private MyRakutenPageEntity myRakutenPageEntity;

	public void VerifyPointClubSection()
    {
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(myRakutenPageEntity.PointInformation()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(myRakutenPageEntity.PointHistory()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(myRakutenPageEntity.WhatIsRakutenSuperPoints()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(myRakutenPageEntity.PointClubTermConditions()));
	}

    public void VerifyMemberInformationSection()
    {
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(myRakutenPageEntity.WhatIsMembership()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(myRakutenPageEntity.AccountSettings()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(myRakutenPageEntity.CreditCardInformation()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(myRakutenPageEntity.ChangePassword()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(myRakutenPageEntity.MemberInformationTermConditions()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(myRakutenPageEntity.CancelMembership()));
    }

    public void VerifyMyShoppingSection()
    {
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(myRakutenPageEntity.MyCart()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(myRakutenPageEntity.MyOrders()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(myRakutenPageEntity.MyRecentlyViewedProducts()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(myRakutenPageEntity.MyWishList()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(myRakutenPageEntity.MyMessages()));
    }

    public void VerifyFAQSection()
    {
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(myRakutenPageEntity.ShoppingGuide()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(myRakutenPageEntity.GeneralFAQ()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(myRakutenPageEntity.ShoppingFAQ()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(myRakutenPageEntity.MembershipFAQ()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(myRakutenPageEntity.RakutenSuperPointFAQ()));
    }
}
