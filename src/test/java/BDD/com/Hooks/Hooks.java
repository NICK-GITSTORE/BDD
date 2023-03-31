package BDD.com.Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import BDD.com.Base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends Base {
	
	// if declare this classes inside backend,by forming hooks class, no need to declare in runner

	@Before
	public void B_Hooks() {										
		System.out.println("before hooks");

	}
	@After
	public void A_Hooks(Scenario sc) {
//		if(sc.isFailed()) {  
		
		TakesScreenshot ts= (TakesScreenshot)wd;
		byte[] scr= ts.getScreenshotAs(OutputType.BYTES);
		sc.attach(scr, "image/jpg", "ss_hooks");
//		}
		
		// do not close the page in feature , when using after hooks
		wd.quit();

	}
}
