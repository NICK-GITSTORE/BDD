package BDD.com.backend;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import BDD.com.Base.Base;
import BDD.com.POM.POM;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Backend extends Base{
	
	POM ob= new POM(wd);

	@Given("User Launch the {string} Browser")
	public void user_launch_the_browser(String string) {
	   Launching(string);
	   
	}
	@Given("User Navigate to FaceBook URL {string}")
	public void user_navigate_to_face_book_url(String string) {
	   Opening(string);
	   
	}
	@Then("User Verify the LoginPage")
	public void user_verify_the_login_page() {
	    Assert.assertTrue(isDis(ob.getFb().getFB_Logo()));
	   
	}
	@Then("User Enter the UserName {string}")
	public void user_enter_the_user_name(String string) {
	   Sending(ob.getFb().getFb_Name(), string);
	   
	}
	@Then("User Enter Password {string}")
	public void user_enter_password(String string) {
	   Sending(ob.getFb().getFb_Pw(),string);
	   
	}
	@Then("User Click the Login Button")
	public void user_click_the_login_button() {
	  Clicking(ob.getFb().getFb_Lb());
	   
	}
	@Then("User verified Logined page")
	public void user_verified_logined_page() {
	    Assert.assertTrue(isDis(ob.getFb().getFb_Vf_Login()));
	   
	}
	
	// TEST CASE 2 methods
	
	@Given("User Navigate to Adactin URL {string}")
	public void user_navigate_to_adactin_url(String string) {
	   Opening(string);
	}

	@Then("User Verify the Adactin Page")
	public void user_verify_the_adactin_page() {
	   Assert.assertTrue(isDis(ob.getAdact().getAdactin_Logo()));   // it will break execution if logo not displayed
	  
	}

	@Then("User Enter Invalid Username {string} and Valid Password {string}")
	public void user_enter_invalid_username_and_valid_password(String string, String string2) {
	    Sending(ob.getAdact().getAdactin_Name(),string);
	    Sending(ob.getAdact().getAdactin_Pw(), string2);
	}

	@Then("User Click the Login Button1")
	public void user_click_the_login_button1() {
	    Clicking(ob.getAdact().getAdactin_Login());
	}

	@Then("User Verify the Error Message {string}")
	public void user_verify_the_error_message(String string) {
		if(string=="Nagative") {
	         Assert.assertTrue(isDis(ob.getAdact().getAdactin_vf_Login()));
	     }
		else if(string=="Positive") {
			Assert.assertTrue(isDis(ob.getAdact2().getAdactin_Vf_Loged()));
		} 
	}	

	@Then("User Enter Valid Username {string} and Invalid Password {string}")
	public void user_enter_valid_username_and_invalid_password(String string, String string2) {
		 Sending(ob.getAdact().getAdactin_Name(),string);
		 Sending(ob.getAdact().getAdactin_Pw(), string2);
	}

	@Then("User Enter the Invalid Usertname {string} and Invalid Password {string}")
	public void user_enter_the_invalid_usertname_and_invalid_password(String string, String string2) {
		 Sending(ob.getAdact().getAdactin_Name(),string);
		 Sending(ob.getAdact().getAdactin_Pw(), string2);
	}

	// scenerio outline minimises feature and backend codes 
	
	@Then("User Enter Username {string} and Password {string}")
	public void user_enter_username_and_password(String string, String string2) {
		Sending(ob.getAdact().getAdactin_Name(),string);
		Sending(ob.getAdact().getAdactin_Pw(), string2);
	}
	
	@Then("Close the Page")
	public void close_the_page() {
	    Closing();
	}

	@Then("Quitting the page")
	public void quitting_the_page() {
		Waiting(10);
	   quitting();
	}

	
	
	

}
