package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public WebDriver driver;
    public Properties prop;
	public WebDriver initialisedriver() throws IOException {
	prop=new Properties();
	FileInputStream fis=new FileInputStream("D:\\JulyJava\\BasicMaven\\src\\main\\java\\resources\\data.propertise");
	prop.load(fis);
	String browsername=prop.getProperty("Browser");

	if(browsername.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("")) {
		
	}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;
	}
	 
}
