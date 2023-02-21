package pojorunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import info.Customer.baseclass;

public class test  extends baseclass{

	public static void main(String[] args) throws Throwable {
		Browser_launch_chrome("chrome");
		maximize_window();
		Get_url("https://www.facebook.com/");
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		send_keys(username,"yuavafralkslkadhadh");
		
		

	}

}
