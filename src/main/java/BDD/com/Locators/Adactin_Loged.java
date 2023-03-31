package BDD.com.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BDD.com.Base.Base;

public class Adactin_Loged extends Base{
	
	public Adactin_Loged(WebDriver mn) {
		this.wd=mn;
		PageFactory.initElements(wd, this);
	}

	@FindBy(xpath="//td[contains(text(),'Search Hotel ')]")
	private WebElement Adactin_Vf_Loged;
	public WebElement getAdactin_Vf_Loged() {
		return Adactin_Vf_Loged;
	}
}