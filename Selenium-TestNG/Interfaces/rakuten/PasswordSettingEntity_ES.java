package rakuten;


public class PasswordSettingEntity_ES extends PasswordSettingEntity{
	@Override
	public String[] PasswordSettingLabel(){
		return new String []{ "xpath", "//h1[contains(text(),\"Configuración de la contraseña\")]" };
	}
	@Override
	public String[] NewPasswordLabel(){
		return new String[]{"xpath","//label[contains(text(),\"Nueva contraseña\")]"};
	}
	@Override
	
	public String[] ReEnterNewPasswordLabel(){
		return new String[]{"xpath","//label[contains(text(),\"Confirmación de la nueva contraseña\")]"};
	}
	@Override	
	
	public String[] OldPasswordSaveChangeLabel(){
		return new String[]{"xpath","//div[contains(text(),\"Introduzca la contraseña antigua para guardar los cambios\")]"};
	}
	
	
}
