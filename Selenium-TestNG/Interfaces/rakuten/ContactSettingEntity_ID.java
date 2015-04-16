package rakuten;


public class ContactSettingEntity_ID extends ContactSettingEntity {
	@Override
	public String[] ContactSettingLabel(){
		return new String []{ "xpath", ".//h1[contains(text(),\"Pengaturan Kontak\")]" };
	}
	@Override
	public String [] CountryLabel(){
		return new String[]{"xpath","//div/label[contains(text(),\"Negara\")]"};
	}
	@Override	
	public String[] AddressLabel(){
		return new String[]{"xpath","//label[contains(text(),\"Alamat\")]"};
	}
	@Override	
	public String[] PostalCodeLabel(){
		return new String[]{"xpath","//label[contains(text(),\"Kode Pos\")]"};
	}
	@Override	
	public String[] CityLabel(){
		return new String[]{"xpath","//label[contains(text(),\"Provinsi\")]"};
	}
	@Override	
	public String[] StateLabel(){
			return new String[]{"xpath","//label[contains(text(),\"Kota\")]"};
	}
	@Override	
	public String[] TelephoneLabel(){
		return new String[]{"xpath","//label[contains(text(),\"Telepon\")]"};
	}
	

}
