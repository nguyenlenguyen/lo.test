package rakuten;

public class HomePageEntity_MY extends HomePageEntity {

    @Override
    public String[] RegisterDialog() { return new String[] { "id", "tweet" };	}

	@Override
	public String[] CloseRegisterDialogIcon() { return new String[] { "id", "close" };	}

}
