package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObjects {

	public WebDriver driver;
	By email=By.xpath("//input[@type='email']");
	By password=By.xpath("//input[@type='password']");
	By login_but=By.xpath("//input[@value='Log In']");
	
	
	public LoginObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public WebElement getemail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getlogin_but() {
		return driver.findElement(login_but);
	}
}
