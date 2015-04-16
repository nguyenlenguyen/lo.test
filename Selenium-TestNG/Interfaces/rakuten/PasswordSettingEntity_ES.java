package rakuten;


public class PasswordSettingEntity_ES extends PasswordSettingEntity{
	@Override
	public String[] PasswordSettingLabel(){
		return new String []{ "xpath", "//h1[contains(text(),\"Configuraci�n de la contrase�a\")]" };
	}
	@Override
	public String[] NewPasswordLabel(){
		return new String[]{"xpath","//label[contains(text(),\"Nueva contrase�a\")]"};
	}
	@Override
	
	public String[] ReEnterNewPasswordLabel(){
		return new String[]{"xpath","//label[contains(text(),\"Confirmaci�n de la nueva contrase�a\")]"};
	}
	@Override	
	
	public String[] OldPasswordSaveChangeLabel(){
		return new String[]{"xpath","//div[contains(text(),\"Introduzca la contrase�a antigua para guardar los cambios\")]"};
	}
	
	
}
