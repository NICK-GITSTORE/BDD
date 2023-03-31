package BDD.com.Base;

import java.io.FileReader;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver wd;
	
	public static void Launching(String br) {
		if(br.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver","rc\\test\\resources\\driver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			wd= new ChromeDriver();
		
		}else if(br.equalsIgnoreCase("edge")) {
//			System.setProperty("webdriver.edge.driver", "C:\\NITHISH\\edgedriver_win64\\msedgedriver.exe");
			WebDriverManager.edgedriver().setup();
			wd= new EdgeDriver();
		}
		Waiting(5);
	}
	
	public  void Opening(String ul) {
		wd.get(ul);
		Waiting(5);

	}
	
	public static boolean isDis(WebElement vs ) {
		boolean disp= false;
		try {
			disp = vs.isDisplayed();
			
		} catch (Exception e) {
			System.out.println("element not found  : " + e.getMessage());
		}
		
		return disp;
	}
	
	public static void Sending(WebElement ele, String ip) {
		ele.sendKeys(ip);
	}
	public static void Clicking(WebElement ele2) {
		ele2.click();
	}
	
	public static void Waiting(int w) {
		wd.manage().timeouts().implicitlyWait(w,TimeUnit.SECONDS);
	}
	
	public static void Closing() {
		wd.close();
	}
	
	public static void quitting() {
		wd.quit();
	}
	
	
	public static String Property_Read(String key) {
		// key and value
		String path="src\\test\\resources\\pp.properties";
	    String val=null;
	    try {
			FileReader f=new FileReader(path);
			Properties pr= new Properties();
			pr.load(f);
				String property = pr.getProperty(key);	  // give key "url"
				System.out.println(property);
				
//				String property2 = pr.getProperty("UserName");
//				System.out.println(property2);
//				
//				String property3 = pr.getProperty("Password");
//				System.out.println(property3);
		} catch (Exception e) {
			
		}
		return val;
	
	
	
	}

}
