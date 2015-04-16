package rakuten;

public class CreditCardInformationEntity {

public String[] CreditCardInformationLabel(){
	return new String[]{"xpath","//h1[contains(text(),\"Credit Card Information\")]"};
}
public String [] AddNewCreditCardButton(){
	return new String[]{"xpath","//a[@href='/member/payments/new']"};
}
public String [] VisaLabel (){
	return new String[]{"xpath","//h2[contains(text(),\"Visa-0002\")]"};
}
public String [] EditCardLink(){
	return new String[] {"xpath","//a[@href='/member/payments/0/edit']"};
}
public String [] DeleteCardLink(){
	return new String[] {"xpath","//a[@href='/member/payments/0']"};
}
public String[] CardNumberLabel(){
	return new String[]{"xpath","//dt[contains(text(),\"Card Number\")]"};
}
public String [] CardNumberTextbox(){
	return new String[]{"xpath",".//*[@id='contents']/div/div[2]/div[2]/div[1]/div[2]/dl[1]/dd/div"};
}
public String[] CardPictureImage(){
	return new String[]{"xpath","//img[@src='/assets/dummy-card-visa-b4731f10cd0835719fd70cde01f32a2f.gif']"};
}
public String[] CardExpirationDateLabel(){
	return new String[]{"xpath","//dt[contains(text(),\"Card Expiration Date\")]"};
}
public String[] CardExpirationDateTextox(){
	return new String []{"xpath",".//*[@id='contents']/div/div[2]/div[2]/div[1]/div[2]/dl[2]/dd/div"};
}
public String[] CardHolderNameLabel(){
	return new String[]{"xpath","//dt[contains(text(),\"Cardholder's Name\")]"};
}
public String[] CardHolderNameTextbox(){
	return new String []{"xpath",".//*[@id='contents']/div/div[2]/div[2]/div[1]/div[2]/dl[3]/dd/div"};
}
}

