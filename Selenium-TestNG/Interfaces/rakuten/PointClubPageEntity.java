package rakuten;

public class PointClubPageEntity {
	public String[] Title() {
		return new String[] { "xpath", "//h1[@class='b-ttl-1']" };
	}
	
	public String[] PointTotalLabel() {
		return new String[] { "xpath", "//dl[contains(@class,'large b-text-def')]/dt/b" };
	}
	
	public String[] PointTotal() {
		return new String[] { "xpath", "//dl[contains(@class,'large b-text-def')]/dd/b" };
	}
}
