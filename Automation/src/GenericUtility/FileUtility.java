package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
		public String fetchDataFromPropertyFile(String key) throws IOException   {
			 
	    FileInputStream fis = new FileInputStream(".src/test/resources/propertData2.properties");
	    Properties property = new Properties();
		property.load(fis);
	    return property.getProperty(key);
		}

	}


