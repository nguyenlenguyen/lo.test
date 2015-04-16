package rakuten;


public class AccountSettingEntity_ID extends AccountSettingEntity{

		@Override
		public String [] AccountSettingLabel(){
			return new String[]{"xpath",".//h1[text()=\"Pengaturan Akun\"]"};
			}	
		@Override
		public String[] FirstNameLabel(){
			return new String[]{"xpath","//label[contains(text(),\"Nama\")]"};
		}
		
		@Override
		public String[] EmailLabel(){
			return new String[]{"xpath",".//label[contains(text(),\"Alamat Email\")]"};
		}
		@Override
		public String[] UserIDLabel(){
			return new String[]{"xpath","//label[contains(text(),\"ID Pengguna\")]"};
		}
		public String[] GenderLabel(){
			return new String[]{"xpath","//label[contains(text(),\"Jenis Kelamin\")]"};
		}
		@Override
		public String[] CTR_GENDER(){
			return new String[]{"xpath","//div/div[contains(text(),\"Pria\")]"};
		}
		
		@Override
		public String[] BirthdayLabel(){
			return new String[]{"xpath","//label[contains(text(),\"Tanggal Lahir\")]"};
		}
		
		public String[] BirthdayTextbox(){
			return new String[]{"xpath",".//div[contains(text(),\"31/05/1906\")]"};
		}
		

		
	}