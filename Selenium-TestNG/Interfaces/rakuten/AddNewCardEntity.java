package rakuten;

public class AddNewCardEntity {
	
	public String[] AddAnewCardLabel(){
		return new String[]{"xpath","//h1[contains(text(),\"Add a New Card\")]"};
	}
	public String[] CardNumberLabel(){
		return new String []{"xpath","//label[contains(text(),\"Card Number\")]"};
	}
	
	public String[] CardNumberTextbox(){
		return new String[]{"id","card_number"};
	}
	
	public String [] MasterCardIconImage(){
		return new String[]{"xpath","//img[@src='/assets/dummy-card-master-f7d53d281b4376c2dd108372b032f669.gif']"};
	
	}
	
	public String [] VisaCardIconImage(){
		return new String[]{"xpath","//img[@src='/assets/dummy-card-visa-b4731f10cd0835719fd70cde01f32a2f.gif']"};
	
	}
	
	public String [] AmexCardIconImage(){
		return new String[]{"xpath","//img[@src='/assets/dummy-card-amex-b5ec240518105e1efc1f52970c43f577.gif']"};
	
	}
	
	public String[] CardExpirationDateLabel(){
		return new String []{"xpath","//label[contains(text(),\"Date\")]"};
	
	}
	
	public String[] CardExpirationMonthCombobx(){
		return new String[]{"id","expiration_month"};
	}
	public String[] CardExpirationYearCombobox(){
		return new String[]{"id","expiration_year"};
	}
		
	public String[] CardHolderNameLabel(){
		return new String []{"xpath","//label[contains(text(),\"Cardholder's Name\")]"};
	}
	public String[] CardHolderNameTextbox(){
		return new String []{"id","card_holder_name"};
	}
	public String [] MakeThisCardCheckbox(){
		return new String[]{"id","is_primary"};
	}
	public String [] AddCardButton(){
		return new String []{"id","card_save_button"};
	}
	public String [] AddCancelButton(){
		return new String []{"xpath","//a[@href='/member/payments']"};
	}
	
	
}


