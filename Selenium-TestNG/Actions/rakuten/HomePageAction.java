package rakuten;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

public class HomePageAction {
	@Inject private HomePageEntity homePageEntity;
	@Inject private TopPageEntity topPageEntity;
	@Inject private PointClubPageEntity pointClubPageEntity;

	public void GoToSignInPage() {
		QTiumAutomation.click(homePageEntity.SignInLink());
		QTiumAutomation.waitForPageLoad(120);
	}

    public void ClosePopup()
    {
        QTiumAutomation.waitForPageLoad(120);
        if (QTiumAutomation.isElementDisplayed(homePageEntity.RegisterDialog())) {
            QTiumAutomation.click(homePageEntity.CloseRegisterDialogIcon());
            QTiumAutomation.sleep(2);
        }
        else if (QTiumAutomation.isElementDisplayed(homePageEntity.ClosePopupIcon())){
            QTiumAutomation.click(homePageEntity.ClosePopupIcon());
        }
    }

	public void OpenHomePage(String url) {
		QTiumAutomation.openURL(url);
        ClosePopup();
	}
	
	public void GoToPointClubPage() {
		QTiumAutomation.click(topPageEntity.PointClubTop());
		QTiumAutomation.waitForPageLoad(120);
		QTiumAutomation.waitForControl(pointClubPageEntity.Title());
	}

    public String GetPointClubValue(){
    	return QTiumAutomation.getText(topPageEntity.PointClubTop());
    }

    public void VerifyControlsOnHeader()
    {
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(homePageEntity.RakutenLogo()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(homePageEntity.RakutenSuperPointsLink()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(homePageEntity.ShoppingGuideLink()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(homePageEntity.OpenYourOnlineStoreLink()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(homePageEntity.CategoriesComboBox()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(homePageEntity.SearchTextBox()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(homePageEntity.SignInLink()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(homePageEntity.RegisterLink()));
        QTiumAssert.verifyTrue(QTiumAutomation.isElementDisplayed(homePageEntity.CartIcon()));
    }
    public void GoToMyAccountPage(){
		QTiumAutomation.waitForControl(homePageEntity.UsernameLabel());
		QTiumAutomation.click(homePageEntity.UsernameLabel());
		QTiumAutomation.click(topPageEntity.MyAccount());
		QTiumAutomation.waitForPageLoad(120);
	}
    
    public void GoToMyRakutenPage(){
    	QTiumAutomation.waitForControl(homePageEntity.UsernameLabel());
		QTiumAutomation.click(homePageEntity.UsernameLabel());
		QTiumAutomation.click(homePageEntity.MyRakutenLink());
		QTiumAutomation.waitForPageLoad(120);
    }
}
