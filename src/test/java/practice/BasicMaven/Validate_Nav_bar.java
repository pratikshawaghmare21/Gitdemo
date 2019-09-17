package practice.BasicMaven;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingObjects;
import resources.Base;

public class Validate_Nav_bar extends Base{
	@BeforeTest
	public void initialise() throws IOException {
		driver=initialisedriver();
		driver.get(prop.getProperty("Url"));
		driver.manage().window().maximize();
	}
	@Test
public void validate_navigate_bar() throws IOException {
	
	LandingObjects ln=new LandingObjects(driver);
	Assert.assertTrue(ln.get_nav_bar().isDisplayed(),"Navigation Bar is dispayed");
}
	@AfterTest
	public void browerselose() {
		driver.close();
	}
}
