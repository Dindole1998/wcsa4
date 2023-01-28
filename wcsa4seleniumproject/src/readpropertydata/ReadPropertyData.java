package readpropertydata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hpsf.Property;

public class ReadPropertyData {
	public static void main(String[] args) throws IOException {
		 
		FileInputStream fis = new FileInputStream("./data/config.properties");// provide the path of property.
		
		Properties prop = new Properties();// to read the data
		
		prop.load(fis);//Use to load/read the file
		
		String data = prop.getProperty("Browser");
		System.out.println(data);
		
		
	}

}
