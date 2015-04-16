package rakuten;


public class ContactSettingEntity_ES extends ContactSettingEntity {
@Override
	public String[] ContactSettingLabel(){
		return new String []{ "xpath", ".//h1[contains(text(),\"Configuraci�n de contacto\")]" };
	}
@Override
	public String [] CountryLabel(){
		return new String[]{"xpath","//div/label[contains(text(),\"Pa�s\")]"};
	}
@Override	
	public String[] AddressLabel(){
		return new String[]{"xpath","//label[contains(text(),\"Direcci�n\")]"};
	}
@Override	
	public String[] PostalCodeLabel(){
		return new String[]{"xpath","//label[contains(text(),\"C�digo postal\")]"};
	}
@Override	
	public String[] TelephoneLabel(){
		return new String[]{"xpath","//label[contains(text(),\"Tel�fono\")]"};
	}
	
}
