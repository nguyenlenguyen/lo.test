package rakuten;


public class ContactSettingEntity_ES extends ContactSettingEntity {
@Override
	public String[] ContactSettingLabel(){
		return new String []{ "xpath", ".//h1[contains(text(),\"Configuración de contacto\")]" };
	}
@Override
	public String [] CountryLabel(){
		return new String[]{"xpath","//div/label[contains(text(),\"País\")]"};
	}
@Override	
	public String[] AddressLabel(){
		return new String[]{"xpath","//label[contains(text(),\"Dirección\")]"};
	}
@Override	
	public String[] PostalCodeLabel(){
		return new String[]{"xpath","//label[contains(text(),\"Código postal\")]"};
	}
@Override	
	public String[] TelephoneLabel(){
		return new String[]{"xpath","//label[contains(text(),\"Teléfono\")]"};
	}
	
}
