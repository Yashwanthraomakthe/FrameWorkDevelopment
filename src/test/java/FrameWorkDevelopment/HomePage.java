package FrameWorkDevelopment;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWorkDevelopmentPackage.base;
import pageObjects.LandingPage;
import pageObjects.Login;


public class HomePage extends base{
	
	private static Logger log = LogManager.getLogger(HomePage.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		
	}	
	
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String username, String password) throws IOException, InterruptedException {
		driver.get(prop.getProperty("url"));
		log.info("basePageNavigation:application opened successfully");
		LandingPage Lp=new LandingPage(driver);
		Lp.signin().click();
		log.info("basePageNavigation:Login Page click succssfull");
		
		Login lp = new Login(driver);
		lp.getEmailId().sendKeys(username);
		lp.getPassword().sendKeys(password);
		Thread.sleep(2000);
		lp.getSignin().click();
		
		log.info("basePageNavigation:Entered details successfull");
		
		
		
		
	}
	
	
	@DataProvider
	public Object[][] getData() {
		//[1]= for 2users we are doing
		//[2]= how many values your are sending per test
		Object[][] data = new Object[2][2];
		
		data[0][0] ="user1 name";
		data[0][1] ="user1 password";
		
		data[1][0] ="user2 name";
		data[1][1] ="user2 password";
		
		
		return data;
		
		

}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver=null;//in every test we are initializing the driver, so no need to keep 
		//alive the old test case object which causes heap in memory so killing driver object
		//
	}	
	
}