package pojorunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import info.Customer.baseclass;
import info.Customer.pomanager;



public class login  extends baseclass{
	
    public  static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
		Browser_launch_chrome("chrome");
		maximize_window();
		pomanager abc= new pomanager(driver);
		Get_url("https://www.facebook.com/");
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		send_keys(abc.getabc().getUsername(),"yuva");
		
		

		
		
		

		
	}

}
