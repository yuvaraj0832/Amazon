package info.Customer;




import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public static WebDriver driver;
	public static void Browser_launch_firefox(String a)throws Throwable{
		if (a=="firefox") {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\lenovo\\eclipse-workspace\\customer\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();	
		}
	}
	public static void send_keys(WebElement element, String value)throws IOException {
		element.sendKeys(value);
	}

	public static void Browser_launch_edge(String s)throws Throwable{
		if (s=="edge") {
			System.setProperty("webdriver.edge.driver","C:\\Users\\lenovo\\eclipse-workspace\\customer\\driver\\msedgedriver.exe");
			driver= new EdgeDriver();
		}
	}


	public static void Browser_launch_chrome(String b)throws Throwable{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions();
		driver=new ChromeDriver(opt);
	}
	public static void Get_url(String url)throws Throwable {
		driver.get(url);

	}
	public static void maximize_window() {
		driver.manage().window().maximize();
	}

	public static void Actions_test(String ax,WebElement element) {
		Actions abc =new Actions(driver);
		if (ax.equalsIgnoreCase("ContextClick")) {
			abc.contextClick(element).build().perform();
		} else if(ax.equalsIgnoreCase("DoubleClick")){
			abc.contextClick(element).build().perform();
		}}	

	public static void screenshot(String cv) throws Throwable{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\lenovo\\eclipse-workspace\\customer\\display\\screen.png");
		FileUtils.copyFile(source, destination);


	}
	public static void navigate_to(String url1)throws Throwable{
		try {
			driver.navigate().to(url1);

		} catch (Exception e) {
			e.printStackTrace();	
		}	
	}
	public static void Get_current_Url() {
		try {
			driver.getCurrentUrl();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void Navigate_back() {
		driver.navigate().back();
	}
	public static void Navigate_Forward(){
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void Navigate_refresh() {
		driver.navigate().refresh();
	}

	public static void Get_title() {
		driver.getTitle();

	}
	public static void windows_handling(String s,String hh) {
		Set<String> windowHandles = driver.getWindowHandles();
		try {
			for (String string : windowHandles) {
				System.out.println(string);
			}
			driver.get(hh);
			for (String xbr: windowHandles) {
				if(driver.switchTo().window(xbr).getTitle().equalsIgnoreCase(hh)) {
					break;
				}
				System.out.println(driver.switchTo().window(xbr).getTitle());
			}

		}
		catch (Exception e) {
			e.printStackTrace(); 
		}
	}
	public static void alert(String url2,String url3,String url4)throws Throwable {
		try{
			WebElement alert1 = driver.findElement(By.xpath(url3));
			alert1.click();
			WebElement alert2 = driver.findElement(By.xpath(url4));
			alert2.click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
		}	

	} 
	public static void Drag_Drop(String nn,String mm)throws Throwable {
		Actions abc=new Actions(driver);
		WebElement drag = driver.findElement(By.xpath(nn));
		WebElement drop= driver.findElement(By.xpath(mm));
		abc.dragAndDrop(drag, drop).build().perform();

	}

	public static void click_to(WebElement element){
		element.click();
	}
	public static void Action_Robot(WebElement element) throws Throwable {
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void Action(WebElement element) {
		Actions abc =new Actions(driver);
		abc.contextClick(element).build().perform();
		abc.doubleClick(element).build().perform();
	}
	public static void Implicity_Wait(WebElement element) {
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.MILLISECONDS);
	}

	public static void close(WebElement element) {
		close(element);

	}
	public static void Quit(WebElement element) {
		Quit(element);
	}
	public static void Isselect(WebElement element)throws Throwable{
		boolean selected = element.isSelected();
		System.out.println(selected);
	}
	public static void isenabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}
	public static void isdisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}


	public static void All_Selected_options(String dd,WebElement element) {
		Select ss=new Select(element);
		boolean multiple = ss.isMultiple();
		System.out.println(multiple);
		ss.selectByVisibleText(dd);
		ss.selectByVisibleText(dd);
		ss.selectByVisibleText(dd);
		ss.selectByVisibleText(dd);
		List<WebElement> allSelectedOptions = ss.getAllSelectedOptions();
		for (WebElement alloptions : allSelectedOptions) {
			System.out.println(alloptions.getText());
		}
	}
	public static void first_selected_options(String dd, WebElement element) {
		Select ss=new Select(element);
		boolean multiple = ss.isMultiple();
		System.out.println(multiple);
		ss.selectByVisibleText(dd);
		WebElement firstSelectedOption = ss.getFirstSelectedOption();
		System.out.println(firstSelectedOption);		
	}
	public static void Drop_down(WebElement element,String aa) {
		try {
			Select ss= new Select(element);
			ss.selectByVisibleText(aa);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void  multiple_drop_down(WebElement element,String aa) {
		try { 
			waitforelementvisibility(element);
			Select ss= new Select(element);
			boolean multiple = ss.isMultiple();
			System.out.println(multiple);
			ss.selectByVisibleText(aa);
			ss.selectByVisibleText(aa);
			ss.selectByVisibleText(aa);
			ss.selectByVisibleText(aa);
			System.out.println(ss.getAllSelectedOptions()); 
		}
		catch (Exception e) {
			e.printStackTrace();		
		}
	}
	public static void Ismultiple(WebElement element) {
		waitforelementvisibility(element);
		Select ss=new Select(element);
		boolean multiple = ss.isMultiple();
		System.out.println(multiple);  
	}
	public static void waitforelementvisibility(WebElement element) {
		element.notify();

	}

	public static void scroll_using_coordinates(String width, String height) {
		try {
			JavascriptExecutor js =(JavascriptExecutor) driver;
			js.executeScript("window.scrollTo("  + width +  "," + height  + ")");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void scrolltbottomofthepage() {
		try {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void scroll_to_top_of_the_page() {
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void Scroll_up() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.Scrollby(0,-500)");
	}
	public static void scroll_down() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.ScrollBy(0,1000)");
	}
	public static void scroll_to_view() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0], scrollIntoView();");//arguments[0], scrollIntoView();"
	}

	public static void Frames(WebElement element, String aa) {
		WebElement first_frame = driver.findElement(By.id(aa));
		driver.switchTo().frame(first_frame).getTitle();	
		driver.switchTo().defaultContent().getTitle();
		WebElement second_frame = driver.findElement(By.className(aa));
		driver.switchTo().frame(second_frame).getTitle();		

	}



	

}







