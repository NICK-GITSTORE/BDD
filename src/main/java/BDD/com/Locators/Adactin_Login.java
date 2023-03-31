package BDD.com.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BDD.com.Base.Base;

public class Adactin_Login extends Base{

	public Adactin_Login(WebDriver al) {
		this.wd = al;
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(xpath="//img[@alt='AdactIn Group']")
	private WebElement Adactin_Logo;
	public WebElement getAdactin_Logo() {
		return Adactin_Logo;
	}
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement Adactin_Name;
	public WebElement getAdactin_Name() {
		return Adactin_Name;
	}
	
	@FindBy(id ="password")
	private WebElement Adactin_Pw;
	public WebElement getAdactin_Pw() {
		return Adactin_Pw;
	}
	
	@FindBy(id="login")
	private WebElement Adactin_Login;
	public WebElement getAdactin_Login() {
		return Adactin_Login;
	}
	
	@FindBy(xpath = "//b[contains(text(),'Invalid Login details')]" )
	private WebElement Adactin_vf_Login;
	public WebElement getAdactin_vf_Login() {
		return Adactin_vf_Login;
	}
	
	
	
}
