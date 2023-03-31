package BDD.com.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BDD.com.Base.Base;

public class Fb_Login extends Base {

	public Fb_Login(WebDriver lp) {
		// TODO Auto-generated constructor stub
	this.wd= lp;
	PageFactory.initElements(wd, this);
	}
	
	@FindBy(xpath="//img[@alt='Facebook']")
	private WebElement FB_Logo ;
	public WebElement getFB_Logo() {
		return FB_Logo;
	}
	

	@FindBy(id="email")
	private WebElement Fb_Name;
	public WebElement getFb_Name() {
		return Fb_Name;
	}
	
	@FindBy(id="pass")
	private WebElement Fb_Pw;
	public WebElement getFb_Pw() {
		return Fb_Pw;
	}

	@FindBy(xpath="//button[@name='login']")
	private WebElement Fb_Lb;
	public WebElement getFb_Lb() {
		
		return Fb_Lb;
	}

	@FindBy(xpath="//span[text()='Friend requests']")
	private WebElement Fb_Vf_Login;
	public WebElement getFb_Vf_Login() {
		return Fb_Vf_Login;
	}
	
	
}

