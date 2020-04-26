package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
public WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	
	By emailId = By.xpath("//input[@id='user_email']");
	By password = By.xpath("//input[@id='user_password']"); 
	By signin = By.xpath("//input[@name='commit']"); 
	
	
	
	public WebElement getEmailId() {
		return driver.findElement(emailId);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getSignin() {
		return driver.findElement(signin);
	}

}



