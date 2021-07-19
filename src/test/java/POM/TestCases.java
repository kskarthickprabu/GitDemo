package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(dataProvider="getdata")
public class TestCases {

	public void login(String UserName,String Password) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.udemy.com/join/login-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2F%3Futm_source%3Dadwords-brand%26utm_medium%3Dudemyads%26utm_campaign%3DBrand-Udemy_la.EN_cc.ROW%26utm_term%3D_._ag_80315195513_._ad_450687451854_._de_c_._dm__._pl__._ti_kwd-302329806175_._li_1028686_._pd__._%26utm_term%3D_._pd__._kw_udemy%2520login_._%26matchtype%3De%26gclid%3DCj0KCQjwub-HBhCyARIsAPctr7xY_NE3zZtPyFhglUg56hRyqMW3Qakf5pHkRM8XpmFd4qQE3vGjFh0aAry2EALw_wcB");
		driver.manage().window().maximize();
		LoginPage li = new LoginPage(driver);
		li.emailId().sendKeys(UserName);
		li.password().sendKeys(Password);
		//li.emailId().sendKeys("kskarthickprabu@gmail.com");
		//li.password().sendKeys("$Aadvik@17");
		li.login().click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		SearchCourses sc = new SearchCourses(driver);
		sc.search().sendKeys("appium");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		sc.selectAppium().click();
		driver.close();
	}

	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[2][2];
		data[0][0] = "kskarthickprabu@gmail.com";
		data[0][1] = "$Aadvik@17";
		data[1][0] = "indumathy.as@gmail.com";
		data[1][1] = "$Aadvik@17";
		return data;
	}
	
}
