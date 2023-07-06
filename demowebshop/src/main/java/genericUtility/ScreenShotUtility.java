package genericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

public class ScreenShotUtility extends Baseclass
{
   public void takingScreenshot()
   {
	TakesScreenshot ts=(TakesScreenshot) driver;
	   {
		   File src = ts.getScreenshotAs(OutputType.FILE);
		   File dest=new File("./errorshot/name.png");
		   try {
			   FileUtils.copyFile(src, dest);
		   } catch (IOException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
		   }
	   }
   }
}
