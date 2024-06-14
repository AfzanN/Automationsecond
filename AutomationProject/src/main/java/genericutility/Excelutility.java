package genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutility {
	
	public String getdatafromExcel (String Sheetname, int rowNum, int colNum) throws EncryptedDocumentException, IOException {
		
		FileInputStream fisE = new FileInputStream("./src/test/resources/testscriptdata.xlsx");
		Workbook workbook = WorkbookFactory.create(fisE);
		return workbook.getSheet(Sheetname).getRow(rowNum).getCell(colNum).getStringCellValue();
		
		
		//public LocalDateTime getdatefromexcel (String Sheetname, int rowNum, int colNum) throws EncryptedDocumentException, IOException {
			
			//FileInputStream fisE = new FileInputStream("./src/test/resources/testscriptdata.xlsx");
			//Workbook workbook = WorkbookFactory.create(fisE);
			//return workbook.getSheet(Sheetname).getRow(rowNum).getCell(colNum).getLocalDateTimeCellValue();
			
		
		
		}
		
		
		
		
		
	}


