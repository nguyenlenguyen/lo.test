package rakuten;

import java.io.IOException;

import jxl.read.biff.BiffException;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

public class PointClubPageAction_TW extends PointClubPageAction{
	 @Inject private PointClubPageEntity_TW pointClubPageEntity;
	 
	 @Override
	 public void VerifyPageUI()
	 {		
		 QTiumAssert.verifyTrue(QTiumAutomation.isElementExists(pointClubPageEntity.Title()));
		 QTiumAssert.verifyTrue(QTiumAutomation.isElementExists(pointClubPageEntity.PointTotalLabel()));
		 QTiumAssert.verifyTrue(QTiumAutomation.isElementExists(pointClubPageEntity.PointTotal()));				
	 }
	 
	 @Override
	 public void VerifyLanguage(String url) throws BiffException, IOException{
		 String languageType = url.substring(url.lastIndexOf('.') + 1);		 		
		 String expectedPointClub = getTextByLanguage("Point Club_key", languageType);
		 String expectedTotalPoints = getTextByLanguage("Total Points_key", languageType);
		 
		 String actualPointClub = QTiumAutomation.getText(pointClubPageEntity.Title());
		 String actualTotalPoints = QTiumAutomation.getText(pointClubPageEntity.PointTotalLabel());		 
		 
		 QTiumAssert.verifyEquals(actualPointClub, expectedPointClub);
		 QTiumAssert.verifyEquals(actualTotalPoints, expectedTotalPoints);
	 }	 	
	 
	 @Override
	 public void VerifyPointTotalIsSamePointTopBar(String expectedPoint)
	 {		 			
		 String pointClubTotalValue = QTiumAutomation.getText(pointClubPageEntity.PointTotal()).replaceAll("[^-?0-9]+", "");		 				 		
		 QTiumAssert.verifyEquals(pointClubTotalValue, expectedPoint);
	 }
}
