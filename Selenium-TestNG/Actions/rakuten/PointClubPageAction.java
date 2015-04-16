package rakuten;

import java.io.IOException;

import jxl.read.biff.BiffException;
import rakuten.util.ExcelUtil;

import com.google.inject.Inject;
import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

public class PointClubPageAction {
	 @Inject private PointClubPageEntity pointClubPageEntity;	 
	 
	 public void VerifyPageUI()
	 {		
		 QTiumAssert.verifyTrue(QTiumAutomation.isElementExists(pointClubPageEntity.Title()));
		 QTiumAssert.verifyTrue(QTiumAutomation.isElementExists(pointClubPageEntity.PointTotalLabel()));
		 QTiumAssert.verifyTrue(QTiumAutomation.isElementExists(pointClubPageEntity.PointTotal()));				
	 }
	 
	 public void VerifyLanguage(String url) throws BiffException, IOException{
		 String languageType = url.substring(url.lastIndexOf('.') + 1);		 		
		 String expectedPointClub = getTextByLanguage("Point Club_key", languageType);
		 String expectedTotalPoints = getTextByLanguage("Total Points_key", languageType);
		 
		 String actualPointClub = QTiumAutomation.getText(pointClubPageEntity.Title());
		 String actualTotalPoints = QTiumAutomation.getText(pointClubPageEntity.PointTotalLabel());		 
		 
		 QTiumAssert.verifyEquals(actualPointClub, expectedPointClub);
		 QTiumAssert.verifyEquals(actualTotalPoints, expectedTotalPoints);
	 }
	 	 
	 public void VerifyPointTotalIsSamePointTopBar(String expectedPoint)
	 {		 			
		 String pointClubTotalValue = QTiumAutomation.getText(pointClubPageEntity.PointTotal());		 				 		
		 QTiumAssert.verifyEquals(pointClubTotalValue, expectedPoint);
	 }
	 
	 public String getTextByLanguage(String key, String languageType) throws BiffException, IOException{
		 return ExcelUtil.getCellValue("Data\\rakuten\\LanguageData.xls", "LanguageData", key, languageType);		 
	 }
}
