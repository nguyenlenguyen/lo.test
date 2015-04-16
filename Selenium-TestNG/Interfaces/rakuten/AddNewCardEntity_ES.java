package rakuten;


public class AddNewCardEntity_ES extends AddNewCardEntity {
	
	@Override
	public String[] AddAnewCardLabel(){
		return new String[]{"xpath","//h1[contains(text(),\"Añadir una nueva tarjeta\")]"};
	}
	@Override
	public String[] CardNumberLabel(){
		return new String []{"xpath","//label[contains(text(),\"Número de tarjeta\")]"};
	}
	@Override
	public String[] CardExpirationDateLabel(){
		return new String []{"xpath","//label[contains(text(),\"Fecha de caducidad de la tarjeta\")]"};
	
	}
	@Override
	public String[] CardHolderNameLabel(){
		return new String []{"xpath","//label[contains(text(),\"Nombre del titular de la tarjeta\")]"};
	}
	@Override
	public String [] MakeThisCardCheckbox(){
		return new String[]{"id","is_primary"};
	}
	
}
