package rakuten;

public class TopPageEntity {
	public String[] PointClubTop(){
		return new String[] {"id", "auto_member_point_club"};
	}
	
	public String[] LoginMemberTop(){
		return new String[] {"id", "auto_login_member"};
	}
	
	public String[] SignOutTop(){
		return new String[] {"id", "auto_member_sign_out"};
	}
	public String[] MyAccount(){
		return new String[] {"id","auto_myaccount"};
	}
}
