package info.Customer;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class adactin1{
	public static WebDriver driver;

				public static void main(String[] args) throws Throwable {
					System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Customer\\driver\\chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
					driver.manage().window().maximize();
					WebElement user_name = driver.findElement(By.xpath("//input[@name='username']"));
			        user_name.click();
			        user_name.sendKeys("yuva0832");
			        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
			        pass.click();
			        pass.sendKeys("JYIWW9");
			        TakesScreenshot ts= (TakesScreenshot) driver;
			        File source=ts.getScreenshotAs(OutputType.FILE);
			        File destination=new File("C:\\Users\\lenovo\\eclipse-workspace\\selenium_\\Display\\log\\login.png");
			        FileUtils.copyFile( source, destination);
			        Thread.sleep(4000);
			        WebElement log_in = driver.findElement(By.cssSelector("[value='Login']"));
			        log_in.click();
			        Thread.sleep(4000);
			        WebElement location= driver.findElement(By.xpath("//select[@name='location']"));
			        location.click();
			        Select ss=new Select(location);
			        ss.selectByVisibleText("London");
			        Thread.sleep(3000);
			        WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
			        hotels.click();
			        Select dd=new Select(hotels);
			        dd.selectByVisibleText("Hotel Sunshine");
			        Thread.sleep(3000);
			        WebElement room_types = driver.findElement(By.cssSelector("[name='room_type']"));
			        room_types.click();
			        Select ff=new Select(room_types);
			        ff.selectByVisibleText("Standard");
			        Thread.sleep(3000);
			        WebElement room_no = driver.findElement(By.cssSelector("[id='room_nos']"));
			        room_no.click();
			        Select hh=new Select(room_no);
			        hh.selectByVisibleText("2 - Two");
			        Thread.sleep(3000);
			       // WebElement date_in = driver.findElement(By.cssSelector("[name='todate_in']"));
			        //date_in.click();
			        //Thread.sleep(3000);
			        //WebElement date_out = driver.findElement(By.cssSelector("[name='datepick_out']"));
			        //date_out.click();
			        //Thread.sleep(2000);
			        WebElement per_person = driver.findElement(By.xpath("//select[@id='adult_room']"));
			        per_person.click();
			        Select aa=new Select(per_person);
			        aa.selectByVisibleText("2 - Two");
			        Thread.sleep(2000);
			        WebElement childs = driver.findElement(By.xpath("//select[@id='child_room']"));
			        childs.click();
			        Select kk=new Select(childs);
			        kk.selectByVisibleText("2 - Two");
			        Thread.sleep(2000);
			        TakesScreenshot td= (TakesScreenshot)driver;
			        File source1=td.getScreenshotAs(OutputType.FILE);
			        File destination1=new File("C:\\Users\\lenovo\\eclipse-workspace\\selenium_\\Display\\search\\search.png");
			        FileUtils.copyFile(source1, destination1);   
			        WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
			        search.click();
			        Thread.sleep(3000);
			        WebElement button_ = driver.findElement( By.xpath("//input[@name='radiobutton_0']"));
			        button_.click();
			        Thread.sleep(2000);
			        WebElement continue_button  = driver.findElement(By.xpath("//input[@name='continue']"));
			        continue_button.click();
			        Thread.sleep(3000);
			        WebElement f_name = driver.findElement(By.xpath("//input[@name='first_name']"));
			        f_name.click();
			        f_name.sendKeys("michal");
			        Thread.sleep(3000);
			        WebElement l_name = driver.findElement(By.xpath("//input[@name='last_name']"));
			        l_name.click();
			        l_name.sendKeys("kong");
			        Thread.sleep(3000);
			        WebElement address = driver.findElement(By.cssSelector("[name^='address']"));
			        address.click();
			        address.sendKeys("0-0,main road street,thiruvallur dist,631204");
			        Thread.sleep(2000);
			        WebElement cc_num = driver.findElement(By.cssSelector("[name*='cc_num']"));
			        cc_num.click();
			        cc_num.sendKeys("2328628628365333");
			        Thread.sleep(2000);
			        WebElement  type = driver.findElement(By.xpath("//select[@name='cc_type']"));
			        type.click();
			        Thread.sleep(2000);
			        Select nn=new Select(type);
			        nn.selectByVisibleText("American Express");
			        WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
			        month.click();
			        Thread.sleep(2000);
			        Select mm=new Select(month);
			        mm.selectByVisibleText("December");
			        WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
			        year.click();
			        Thread.sleep(2000);
			        Select ll=new  Select(year);
			        ll.selectByVisibleText("2022");
			        WebElement cvv = driver.findElement(By.cssSelector("[maxlength='4']"));
			        cvv.click();
			        Thread.sleep(2000);
			        cvv.sendKeys("3456");
			        TakesScreenshot tf=(TakesScreenshot) driver;
			        File source2=tf.getScreenshotAs(OutputType.FILE);
			        File destination2=new File("C:\\Users\\lenovo\\eclipse-workspace\\selenium_\\Display\\logouT\\last.png");
			        FileUtils.copyFile(source2, destination2);
			        WebElement button2 = driver.findElement(By.cssSelector("[value='Book Now']"));
			        button2.click();  
			        Thread.sleep(6000);
			        WebElement logout = driver.findElement(By.xpath("//input[@name='logout']"));
			        JavascriptExecutor js =(JavascriptExecutor)driver; 
			        js.executeScript("arguments[0].scrollIntoView();",logout);
			        Thread.sleep(3000);
			        js.executeScript("window.scroll(0,0)","");
			        Thread.sleep(3000);
			        js.executeScript("arguments[0].click();",logout);
			        Thread.sleep(3000);		        
			        
				}

		}




