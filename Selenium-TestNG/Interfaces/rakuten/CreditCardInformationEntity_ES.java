package rakuten;


public class CreditCardInformationEntity_ES extends CreditCardInformationEntity {
	@Override
	public String[] CreditCardInformationLabel(){
		return new String[]{"xpath","//h1[contains(text(),\"Informaci�n de la tarjeta de cr�dito\")]"};
	}
	@Override
	public String[] CardNumberLabel(){
		return new String[]{"xpath","//dt[contains(text(),\"N�mero de tarjeta\")]"};
	}
	@Override
		public String[] CardExpirationDateLabel(){
		return new String[]{"xpath","//dt[contains(text(),\"Fecha de caducidad de la tarjeta\")]"};
	}
	@Override
	public String[] CardHolderNameLabel(){
		return new String[]{"xpath","//dt[contains(text(),\"Nombre del titular de la tarjeta\")]"};
	}
}
