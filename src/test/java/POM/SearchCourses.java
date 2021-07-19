package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchCourses {

	WebDriver driver;

	public SearchCourses(WebDriver driver) {
		this.driver = driver;
	}

By search = By.xpath("//input[@name='q']");
By selectAppium = By.xpath("//strong[contains(text(),'appium')]");



public WebElement search()
{
	return driver.findElement(search);
}
public WebElement selectAppium()
{
	return driver.findElement(selectAppium);
}

}
