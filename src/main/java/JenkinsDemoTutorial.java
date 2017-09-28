import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JenkinsDemoTutorial {

	public static void main(String[] args) {

		String filePath = System.getProperty("user.dir")+File.separator+"lib"+File.separator+"geckodriver.exe";
		
		System.out.println("fp "+filePath);
		

		System.setProperty("webdriver.firefox.marionette",filePath);
		
		WebDriver driver = new FirefoxDriver();
		
		String baseUrl = "http://www.google.com";
		String tagName = "";

		driver.get(baseUrl);
		
		
		tagName = driver.findElement(By.id("gs_lc0")).getTagName();
		
		System.out.println("tagname : "+tagName);
		
		
		Assert.assertEquals("div", tagName);
		driver.close();
	}}
