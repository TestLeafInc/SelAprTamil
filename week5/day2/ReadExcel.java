package week5.day2;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	// .xlsx -> XSSF (Prefix)
	// .xls -> HSSF (Prefix)
	
	@Test
	public void readExcelData() throws InvalidFormatException, IOException {
		
		// Workbook
		File excelFileName = new File("./data/Leads.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(excelFileName);
		
		// Sheet
		XSSFSheet sheet = wbook.getSheet("Create Lead");
		
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum(); // how many columns?
			
		for (int i = 1; i <= rowCount; i++) {
			// Row
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				// Column / Cell
				XSSFCell cell = row.getCell(j);
				// Print all the column values
				System.out.println(cell.getStringCellValue());
			} 
		}
		// Close the workbook
		wbook.close();
		
	}

}
