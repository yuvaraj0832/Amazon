package workspace;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class day1 {

	@Test
	public void yuva() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		WebDriver driver=new ChromeDriver(opt);
		driver.get("www.facebook.com");
	}
	

}
