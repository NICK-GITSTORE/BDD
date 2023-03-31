Feature: To verify smoke test cases

Background:
Given User Launch the "Edge" Browser

@TC-1 @ab
Scenario: To verify Login functionality

Given User Navigate to FaceBook URL "https://www.facebook.com/"
Then User Verify the LoginPage
Then User Enter the UserName "dsnithishkumar@gmail.com"
Then User Enter Password "secretpassword"
Then User Click the Login Button
Then User verified Logined page



@TC-2
Scenario: To verify Login with invalid datas

And User Navigate to Adactin URL "https://adactinhotelapp.com/"
Then User Verify the Adactin Page
And User Enter Invalid Username "8777787d" and Valid Password "secretpassword"
Then User Click the Login Button1
Then User Verify the Error Message "Nagative"
And User Enter Valid Username "8667803654" and Invalid Password "rdhsdgwsgsd"
Then User Click the Login Button1 
Then User Verify the Error Message "Nagative"
And User Enter the Invalid Usertname "545485" and Invalid Password "degbhjydd"
Then User Click the Login Button1
Then User Verify the Error Message "Nagative"




@TC-3 @ab
Scenario Outline: User Verify the Login Functionality with Details

And User Navigate to Adactin URL "https://adactinhotelapp.com/"
Then User Verify the Adactin Page
And User Enter Username <Username> and Password <Password> 
And User Click the Login Button1
Then User Verify the Error Message <inorout>


Examples:
|Username||Password||inorout|
|"8777787d"||"secretpassword"||"Nagative"|
|"8667803654"||"rdhsdgwsgsd"||"Nagative"|
|"545485"||"degbhjydd"||"Nagative"|
|"vnvnvnvnvn"||"123456"||"Nagative"|