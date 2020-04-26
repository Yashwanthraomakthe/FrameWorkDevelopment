package FrameWorkDevelopment;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import FrameWorkDevelopmentPackage.base;
import junit.framework.Assert;
import pageObjects.LandingPage;

public class ValidateNavigationbar extends base{
	
	private static Logger log = LogManager.getLogger(ValidateNavigationbar.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}	
	
	@Test
	public void navigationBar() throws IOException  {
		
		
		LandingPage Lp=new LandingPage(driver);
		
		Assert.assertTrue(Lp.getnavigationBar().isDisplayed());
		
		log.info("ValidateNavigationbar:Navigation bar displayed");
		
		
		
		

}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver=null;
	}	

}
