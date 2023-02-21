package info.Customer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojo {
	public  WebDriver driver;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	

	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public pojo(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver,this);
		
	}

}
