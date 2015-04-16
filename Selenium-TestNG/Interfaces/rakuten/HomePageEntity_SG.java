package rakuten;

public class HomePageEntity_SG extends HomePageEntity {

    @Override
    public String[] RegisterDialog() {
        return new String[] { "id", "dialog" };
    }

    @Override
    public String[] CloseRegisterDialogIcon() {
        return new String[] { "xpath", "//div[@id='dialog']//img[contains(@src,'close.png')]" };
    }
}
