package rakuten;


public class AccountSettingEntity {
	
public String[] AccountSettingMenu(){
	return new String []{ "xpath", ".//a[@href = '#']" };
}
public String[] ContactSettingMenu (){
	return new String [] {"xpath",".//a[@href = '/member/contact']"};
	}
public String[] PasswordSettingMenu(){
	return new String[]{"xpath",".//a[@href = '/member/setpassword']"};
} 
public String[] CreditCardInformationMenu(){
	return new String[]{"xpath",".//a[@href = '/member/payments']"};
	
}
public String [] CancelMemberShipMenu(){
	return new String[] {"xpath",".//a[@href = '/member/cancel']"};
}


public String [] AccountSettingLabel(){
	return new String[]{"xpath",".//h1[text()=\"Account Settings\"]"};
}

public String[] FirstNameLabel(){
	return new String[]{"xpath",".//label[text()=\"First Name\"]"};
}

public String[] FirstNameTextbox(){
	return new String[]{"id","pr_first_name"};
}

public String[] LastNameLabel(){
	return new String[]{"xpath",".//label[text()=\"Last Name\"]"};
}
public String[] LastNameTextbox(){
	return new String[]{"id","pr_last_name"};
}

public String[] EmailLabel(){
	return new String[]{"xpath",".//label[contains(text(),\"Email Address\")]"};
}
public String[] EmailTextbox(){
	return new String[] {"id","email"};
}

public String[] UserIDLabel(){
	return new String[]{"xpath","//label[contains(text(),\"User\")]"};
}

public String[] UserIDUserEmailRadio(){
	return new String[]{"id","radio_userid_use_email"};
}

/*public String[] LBL_USE_ADD_A_USERID(){
	return new String[]{};
}*/

public String[] UserIDUuseAddAUserIDRadio(){
	return new String[]{"id","radio_userid_use_username"};
}

/*public String[] LBL_USERNAME(){
	return new String[]{};
}*/
public String[] UserNameTextbox(){
	return new String[]{"id","username"};
}

public String[] GenderLabel(){
	return new String[]{"xpath","//label[contains(text(),\"Gender\")]"};
}
public String [] CTR_GENDER(){
	return new String[]{"xpath","//div[@class = 'b-control-group-child']/label[@class = 'b-control-label']/../div"};
}

// Define control for birthday for ES, SG site
public String[] BirthdayLabel(){
	return new String[]{"xpath","//label[contains(text(),\"Date of Birth\")]"};
}

public String [] BithdayTextbox(){
	return new String[]{"xpath",".//div/label[contains(text(),'Date of Birth')]/../div/div"};
	}

public String[] DDCombobox(){
	return new String[]{"id","id='pr_dob_dd"};
}

public String [] MMCombobox(){
	return new String[]{"id","pr_dob_mm"};
}

public String [] YYYYCombobox(){
	return new String[]{"id","pr_dob_yyyy"};
}

public String[]ProfileSaveChangeButton(){
	return new String[]{"id","profile_save_button"};
}
}
