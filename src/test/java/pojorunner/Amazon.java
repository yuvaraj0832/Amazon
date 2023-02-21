package pojorunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import info.Customer.baseclass;

public class Amazon  extends baseclass{
	public static void main(String[] args) throws Throwable {
		Browser_launch_chrome("chrome");
		maximize_window();
		Get_url("https://www.amazon.in");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		click_to(search);
		send_keys(search,"poco m2 pro back cover")	;
		WebElement search_button = driver.findElement(By.xpath("//input[@type='submit']"));
		click_to(search_button);
		WebElement product = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
		click_to(product);
		scroll_to_view();
		WebElement buy_now = driver.findElement(By.id("buy-now-button"));
		Implicity_Wait(buy_now);
		WebElement button = driver.findElement(By.xpath("//input[@name='submit.buy-now']"));
		click_to(button);
	}

}
