package rakuten;

public class TopPageEntity_TW extends TopPageEntity{
	
	@Override
	public String[] SignOutTop(){
		return new String[] {"xpath", "//div[@id='mainbar']/ul/li[@class='others reds first01']/a[contains(@href,'logout')]"};
	}
}
