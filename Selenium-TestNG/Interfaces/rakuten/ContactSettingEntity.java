package rakuten;


public class ContactSettingEntity {
	
public String[] ContactSettingLabel(){
	return new String []{ "xpath", ".//h1[contains(text(),\"Contact Settings\")]" };
}

public String [] CountryLabel(){
	return new String[]{"xpath","//div/label[contains(text(),\"Country\")]"};
}
public String[] CountryBombobox (){
	return new String[]{"id","country_code"};
}
public String[] AddressLabel(){
	return new String[]{"xpath","//label[contains(text(),\"Address\")]"};
}
public String[] AddressTextbox (){
	return new String[]{"id","street_address"};
}
public String[] PostalCodeLabel(){
	return new String[]{"xpath","//label[contains(text(),\"Post\")]"};
}
public String[] PostalCodeTextbox(){
	return new String[]{"id","postal_code"};
}
public String[] CityLabel(){
	return new String[]{"xpath","//label[contains(text(),\"City\")]"};
}
public String[] CityTextbox(){
	return new String[]{"id","city"};
}
public String[] StateLabel(){
		return new String[]{"xpath","//label[contains(text(),\"State\")]"};
}
public String[] StateCombobox(){
	return new String[]{"id","state"};
}
public String[] TelephoneLabel(){
	return new String[]{"xpath","//label[contains(text(),\"Telephone\")]"};
}
public String[] TelephoneTextbox(){
	return new String[]{"id","phone_number"};
}
public String [] SaveChangeButton(){
	return new String[]{"id","contact_save_button"};
}
}
