package rakuten;

public class PointClubPageEntity_TW extends PointClubPageEntity{
	
	@Override
	public String[] Title() {
		return new String[] { "xpath", "//div[@id='point_head']/div[@class='head']/span" };
	}
	
	@Override
	public String[] PointTotalLabel() {
		return new String[] { "xpath", "//div[@class='head clearfix']/div[@class='leftSide']/span" };
	}
	
	@Override
	public String[] PointTotal() {
		return new String[] { "xpath", "//div[@class='head clearfix']/div[@class='rightSide']/span" };
	}
}
