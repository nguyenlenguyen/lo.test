package rakuten;

public class CancelMemberShipEntity {

public String[] CancelMemberShipLabel(){
	return new String[]{"xpath","//h1[@class='b-ttl-1']"};
}
public String[] OnYouCancelLabel(){
	return new String[]{"xpath","//div[@class='b-ttl b-float-left']"};
}

public String[] WeSorryLabel(){
	return new String[]{"xpath","//fieldset/h2[@class='b-legend']"};
}

public String[] ViewInAWindowLabel(){
	return new String[]{"xpath","//a[@class='b-float-right']"};
}
public String[] UserIDLabel(){
	return new String[] {"xpath","//div[1]/label[@class = 'b-control-label']"};
}

public String[] UserIDTextbox(){
	return new String[]{"xpath","//div[1]/div/div[@class=\"b-help-block\"]"};
}
public String[] PasswordLabel(){
	return new String[] {"xpath","//div[2]/label[@class = 'b-control-label']"};
}
public String[] PasswordTextbox(){
	return new String[]{"id","password"};
}
public String[] IHaveReviewCheckbox(){
	return new String[]{"id","advisory_accept"};
}
public String[] CancelMemberShipButton(){
	return new String[]{"id","member_cancel_button"};
}

}
