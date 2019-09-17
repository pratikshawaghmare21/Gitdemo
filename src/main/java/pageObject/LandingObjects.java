package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingObjects {

	
	public WebDriver driver;
	By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.xpath("//h2[contains(text(),'Featured Courses')	]");
	By nav_bar=By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	
	
	
	public LandingObjects(WebDriver driver2) {
		this.driver=driver2;
	}



	public WebElement getlogin() {
		//this.driver=driver;
		return driver.findElement(signin);
	}
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	public WebElement get_nav_bar() {
		return driver.findElement(nav_bar);
	}
}
