package BDD.com.POM;

import org.openqa.selenium.WebDriver;


import BDD.com.Base.Base;
import BDD.com.Locators.Adactin_Loged;
import BDD.com.Locators.Adactin_Login;
import BDD.com.Locators.Fb_Login;

public class POM extends Base{
	
	public POM(WebDriver pm) {
		this.wd= pm;
	}
    
	private Fb_Login Fb;

	public Fb_Login getFb() {
		if(Fb==null) {
			Fb= new Fb_Login(wd);
		}
		return Fb;
	}
	
	

	private Adactin_Login Adact;

	public Adactin_Login getAdact() {
		if(Adact==null) {
			Adact = new Adactin_Login(wd);
		}
		return Adact;
	}
	
	private Adactin_Loged Adact2;
	public Adactin_Loged getAdact2() {
		if(Adact2==null) {
			Adact2= new Adactin_Loged(wd);
		}
		return Adact2;
	}
	
	
}
