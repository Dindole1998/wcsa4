

package dataDrivenFrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	// use to store only the GENERIC REUSABLE METHODS
	public String readExcelData(String execelPath,String sheetName,int rowCount,int cellCount ) throws EncryptedDocumentException, IOException	{
		FileInputStream fis = new FileInputStream(execelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetName);
	 Row row = sheet.getRow(rowCount);
	 Cell cell = row.getCell(cellCount);
	 String data = cell.getStringCellValue();
	 return data;
	}
	
	
	// To get LastRow Count
	public int rowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;                                  
	}
	
	
	// To write excel Data
	public void writeExcelData(String ecelPath,String sheetName,int rowCount,int cellCount,String data, String excelPath) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new  FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);
		 
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
		
		
		
	
	}
	
	
	
	
	
	
	
}
