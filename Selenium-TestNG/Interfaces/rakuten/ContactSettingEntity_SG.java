package rakuten;


public class ContactSettingEntity_SG extends ContactSettingEntity {

	@Override
public String[] ContactSettingLabel(){
	return new String []{ "xpath", ".//h1[contains(text(),\"Contact Settings\")]" };
}
	@Override
public String [] CountryLabel(){
	return new String[]{"xpath","//div/label[contains(text(),\"Country\")]"};
}
@Override
public String[] AddressLabel(){
	return new String[]{"xpath","//label[contains(text(),\"Address\")]"};
}
	@Override
public String[] PostalCodeLabel(){
	return new String[]{"xpath","//label[contains(text(),\"Post\")]"};
}

	@Override
public String[] TelephoneLabel(){
	return new String[]{"xpath","//label[contains(text(),\"Telephone\")]"};
}

}
