package FrameWorkDevelopmentPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class base {

	public static WebDriver driver; //made driver as static to restrict another
	//class modify the driver
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException{
		
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\YashPooja\\FrameWorkDevelopment\\src\\main\\java\\FrameWorkDevelopmentPackage\\Data.properties");
		prop.load(ip);
		
		String browserName= prop.getProperty("browser");
		System.out.println(browserName);
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equals("firefox")){
			
		}
			//
		
		else if(browserName.equals("IE")) {
		//
	}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		return driver;
	}
	
	public void getScreenshot(String result) throws IOException {
	
	File src = (File)((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("F://" + result+ "Screenshot.png"));
	
}
}


