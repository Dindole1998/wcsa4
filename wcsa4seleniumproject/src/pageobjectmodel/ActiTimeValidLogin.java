package pageobjectmodel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ActiTimeValidLogin extends BaseTest {
	
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		
		// For Open Browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		
		// read the data from Property File
		   Flib flib = new Flib();
		  // String usn = flib.readExcelData(EXCEL_PATH, "validdata", 1, 0);
		   //String pass = flib.readExcelData(EXCEL_PATH, "validdata", 1, 1);
		 
		 LoginPage lp = new LoginPage(driver);
	//	 lp.actiTimeValidLogin(usn, pass);
		 lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
	}
	

}
