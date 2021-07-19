package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	
	By emailId=By.xpath("//input[@name='email']");
	By password=By.xpath("//input[@name='password']");
	By login = By.xpath("//input[@type='submit']");
	
	
	public WebElement emailId()
	{
	return driver.findElement(emailId);
	}
	public WebElement password()
	{
	return driver.findElement(password);
	}
	public WebElement login()
	{
	return driver.findElement(login);
	}

}
