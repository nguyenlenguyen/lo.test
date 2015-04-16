package rakuten;


public class PasswordSettingEntity_ID extends PasswordSettingEntity{
	@Override
	public String[] PasswordSettingLabel(){
		return new String []{ "xpath", "//h1[contains(text(),\"Pengaturan Kata Sandi\")]" };
	}
	@Override
	public String[] NewPasswordLabel(){
		return new String[]{"xpath","//label[contains(text(),\"Kata Sandi Baru\")]"};
	}
	@Override
	
	public String[] ReEnterNewPasswordLabel(){
		return new String[]{"xpath","//label[contains(text(),\"Masukkan Kembali Kata Sandi Baru\")]"};
	}
	@Override	
	
	public String[] OldPasswordSaveChangeLabel(){
		return new String[]{"xpath","//div[contains(text(),\"Masukkan Kata Sandi Lama untuk Menyimpan Perubahan\")]"};
	}
	
	

}
