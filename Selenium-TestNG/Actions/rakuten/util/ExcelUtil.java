package rakuten.util;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class ExcelUtil {	
	public static String getCellValue(String fileName, String sheetName, int row, int column) throws BiffException, IOException{
		Workbook workbook = Workbook.getWorkbook(new File(fileName));
		Sheet sheet = workbook.getSheet(sheetName);
		Cell cell = sheet.getCell(column, row);		
		String output = cell.getContents();
		workbook.close();
		return output;
	}
	
	public static String getCellValue(String fileName, String sheetName, String key, String columnName) throws BiffException, IOException{
		Workbook workbook = Workbook.getWorkbook(new File(fileName));
		Sheet sheet = workbook.getSheet(sheetName);
		int totalComlumns = sheet.getColumns();		
		int column = -1;
		for(int i = 0; i<totalComlumns; i++){
			String columnTitle = sheet.getCell(i, 0).getContents();			
			if(columnTitle.toLowerCase().equals(columnName.toLowerCase())){
				column = i;
			}				
		}					
		int row = sheet.findCell(key).getRow();
		Cell cell = sheet.getCell(column, row);		
		String output = cell.getContents();
		workbook.close();
		return output;
	}
}
