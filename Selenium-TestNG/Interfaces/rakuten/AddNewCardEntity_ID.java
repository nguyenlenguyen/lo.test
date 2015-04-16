package rakuten;


public class AddNewCardEntity_ID extends AddNewCardEntity {
	
	@Override
	public String[] AddAnewCardLabel(){
		return new String[]{"xpath","//h1[contains(text(),\"Tambahkan Kartu Baru\")]"};
	}
	@Override
	public String[] CardNumberLabel(){
		return new String []{"xpath","//label[contains(text(),\"Nomor Kartu\")]"};
	}
	@Override
	public String[] CardExpirationDateLabel(){
		return new String []{"xpath","//label[contains(text(),\"Tanggal Kedaluwarsa Kartu\")]"};
	
	}
	@Override
	public String[] CardHolderNameLabel(){
		return new String []{"xpath","//label[contains(text(),\"Nama Pemegang Kartu\")]"};
	}
	@Override
	public String [] MakeThisCardCheckbox(){
		return new String[]{"id","is_primary"};
	}
	
}
