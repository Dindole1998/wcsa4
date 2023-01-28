package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		for(int i=1;i<=6;i++)
		{
		FileInputStream fis = new FileInputStream("./data/Test Executor.xlsx"); //provide the excel sheet
	      Workbook wb = WorkbookFactory.create(fis);//make the file for Read
	      Sheet sheet = wb.getSheet("IPL"); // take sheet Name
	      Row row = sheet.getRow(i); //get the value of row by passing integer arg.
	      Cell cell = row.getCell(0);// get the value of cell.
	      String data = cell.getStringCellValue();// it will give the value present in cell
	      System.out.println(data);
	}
		
		
		
		
}
}