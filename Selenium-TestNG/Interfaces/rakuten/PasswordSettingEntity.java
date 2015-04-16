package rakuten;

public class PasswordSettingEntity {

	public String[] PasswordSettingLabel(){
		return new String []{ "xpath", "//h1[contains(text(),\"Password Setting\")]" };
	}
	public String[] NewPasswordLabel(){
		return new String[]{"xpath","//label[contains(text(),\"New Password\")]"};
	}

	public String[] NewPasswordTextbox(){
		return new String[]{"id","password"};
	}
	
	public String[] ReEnterNewPasswordLabel(){
		return new String[]{"xpath","//label[contains(text(),\"password\")]"};
	}
	public String[] ReEnterNewPasswordTextbox(){
		return new String[]{"id","password_confirmation"};
	}
	
	public String[] OldPasswordSaveChangeLabel(){
		return new String[]{"xpath","//div[contains(text(),\"Enter Old Password to Save Changes\")]"};
	}
	public String[] OldPasswordSaveChangeTexbox(){
		return new String[]{"id","current_password"};
	}
	public String[] SaveChangeButton(){
		return new String[]{"name","commit"};
	}
}
