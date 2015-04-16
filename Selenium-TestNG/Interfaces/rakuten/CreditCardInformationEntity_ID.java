package rakuten;


public class CreditCardInformationEntity_ID extends CreditCardInformationEntity {
	@Override
	public String[] CreditCardInformationLabel(){
		return new String[]{"xpath","//h1[contains(text(),\"Informasi Kartu Kredit\")]"};
	}
	
}
