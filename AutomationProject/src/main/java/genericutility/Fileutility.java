package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fileutility {
	
	public String getDatafromproperty(String Key) throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
	
		return prop.getProperty(Key);
				
		
		
		
	}

}
