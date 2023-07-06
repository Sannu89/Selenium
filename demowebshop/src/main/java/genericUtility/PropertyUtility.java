package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility
{
	public String readingDataFromPPt(String key) throws IOException 
	{
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("./src/test/resources/Data.properties");
		} catch (FileNotFoundException e)
		{
			//TODO Auto=generated catch block
			e.printStackTrace();
		}
		Properties property = new Properties();
		property.load(fis);
		return property.getProperty(key);

	}
}
