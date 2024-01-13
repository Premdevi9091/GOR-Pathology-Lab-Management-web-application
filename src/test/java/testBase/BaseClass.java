package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class BaseClass {
	
	//defining webdriver
	public static WebDriver driver;
	public static Properties fileobj;
	@BeforeClass
	public static void setup() throws IOException
	{
		
		//driver initialization
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//loading properties file
		FileReader file=new FileReader(".//src//test//resources//config.properties");
		fileobj=new Properties();
		fileobj.load(file);
		
		//loading url
		driver.get(fileobj.getProperty("appURL"));
		driver.manage().window().maximize();
	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date(0));
				
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver;

		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;
	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
