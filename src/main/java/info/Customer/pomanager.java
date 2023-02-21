package info.Customer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pomanager {
	public  WebDriver driver;
	
	private pojo abc;
	
	public pojo getabc() {
		abc= new pojo(driver);
		return abc;
		
	}
	public pomanager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

}
