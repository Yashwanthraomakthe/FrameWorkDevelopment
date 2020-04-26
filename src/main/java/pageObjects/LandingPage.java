package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By signin = By.xpath("//span[text()='Login']");
	By homePagecoursesTitle = By.xpath("//h2[text()='Featured Courses']");
	By navigationBar = By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	
	
	
	


	public WebElement signin() {
		return driver.findElement(signin);
	}
	
	public WebElement getHomePagecoursesTitle() {
		return driver.findElement(homePagecoursesTitle);
	}

	public WebElement getnavigationBar() {
		return driver.findElement(homePagecoursesTitle);
	}
	
}
