package rakuten;

public class CancelMemberShipEntity_UK extends CancelMemberShipEntity {

@Override
public String[] CancelMemberShipButton(){
	return new String[]{"xpath","//button[@class ='b-btn b-btn-type-a b-btn-emph submit-btn']"};
}

}
