package practice.BasicMaven;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingObjects;
import pageObject.LoginObjects;
import resources.Base;

public class HomePage extends Base {

	@BeforeTest
	public void initialise() throws IOException {
		driver=initialisedriver();
		
	}
	
	@Test(dataProvider ="getdata")
	public void basePageNavigation(String username,String password) throws IOException {
		driver.get(prop.getProperty("Url"));
		driver.manage().window().maximize();
		LandingObjects ln=new LandingObjects(driver);
		ln.getlogin().click();
		LoginObjects lg=new LoginObjects(driver);
		//lg.getemail().sendKeys("pratiksha@gmail.com");
		//lg.getPassword().sendKeys("pratiksha");
		lg.getemail().sendKeys(username);
		lg.getPassword().sendKeys(password);
		lg.getlogin_but().click();
	}
	
	@DataProvider
	public Object[][] getdata() {
		Object [][]data=new Object[2][2];
		data[0][0]="pratiksha1@gmail.com";
		data[0][1]="pratiksha1";
		
		
		  data[1][0]="pratiksha2@gmail.com";
		  data[1][1]="pratiksha2";
		 
		
		return data;
		
	}
	@AfterTest
	public void browerselose() {
		driver.close();
	}
}
