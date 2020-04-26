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

public class HomePageCourseTitleValidation extends base{
	
	private static Logger log = LogManager.getLogger(HomePageCourseTitleValidation.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}	
	
	
	
	@Test
	public void CourseTitle() throws IOException  {
		
		
		LandingPage Lp=new LandingPage(driver);
		
		String coursesHeader=Lp.getHomePagecoursesTitle().getText();
		log.info("HomePageCourseTitleValidation:course Header printed");
		System.out.println(coursesHeader);
		Assert.assertEquals("FEATURED COURSES", coursesHeader);
		
		

}
	@AfterTest
	public void tearDown() {
		driver.close();
		driver=null;
	}	
	
}

