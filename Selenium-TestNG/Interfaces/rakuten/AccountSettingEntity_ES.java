package rakuten;



public class AccountSettingEntity_ES extends AccountSettingEntity{

	@Override
	public String [] AccountSettingLabel(){
		return new String[]{"xpath",".//h1[contains(text(),\"Configuraci�n de la cuenta\")]"};
	}
	@Override
	public String[] FirstNameLabel(){
		return new String[]{"xpath",".//label[contains(text(),\"Nombre\")]"};
	}
	@Override
	public String[] LastNameLabel(){
		return new String[]{"xpath",".//label[contains(text(),\"Apellido\")]"};
		
	}
	@Override
	public String[] EmailLabel(){
		return new String[]{"xpath",".//label[contains(text(),\"Direcci�n de correo electr�nico\")]"};
	}
	@Override
	public String[] UserIDLabel(){
		return new String[]{"xpath","//label[contains(text(),\"ID de usuario\")]"};
	}
	public String[] GenderLabel(){
		return new String[]{"xpath","//label[contains(text(),\"Sexo\")]"};
	}
		
	@Override
	public String[] BirthdayLabel(){
		return new String[]{"xpath","//label[contains(text(),\"Fecha de nacimiento\")]"};
	}
	

	
}
