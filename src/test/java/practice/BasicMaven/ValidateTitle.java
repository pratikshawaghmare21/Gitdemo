package practice.BasicMaven;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingObjects;
import resources.Base;

public class ValidateTitle extends Base {
	
	@BeforeTest
	public void initialise() throws IOException {
		driver=initialisedriver();
		driver.get(prop.getProperty("Url"));
		driver.manage().window().maximize();
	}
@Test
public void ValidateTheTitle() throws IOException {
	LandingObjects ln=new LandingObjects(driver);
	String ActualTitle=ln.getTitle().getText();
	Assert.assertEquals(ActualTitle, "FEATURED COURSES");
}

@AfterTest
public void browerselose() {
	driver.close();
}
}
