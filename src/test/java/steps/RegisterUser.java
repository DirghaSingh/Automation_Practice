package steps;

import io.cucumber.java.en.Given;
import pages.RegisterUserPage;

public class RegisterUser extends BaseSteps{

    RegisterUserPage login = new RegisterUserPage(driver);
    
    @Given("User navigates to home page")
    public void open_url(){
        driver.get("https://automationexercise.com/");
    }

    @Given("Verify that home page is visible successfully")
    public void Verify_that_home_page_is_visible_successfully() {
         login.verify_homepage();
    }

    @Given("Click on {string} button")
    public void Click_on_button(String s) {
        login.click_signup();
    }

    @Given("Verify {string} is visible")
    public void Verify_is_visible(String s) {
       login.verify_newsignup();
    }

    @Given("Enter name and email address")
    public void Enter_name_and_email_address() {
        login.enter_details();
    }

    @Given("Click {string} button")
    public void Click_button(String s) {
        login.click_signupbutton();
    }

    @Given("Verify that {string} is visible")
    public void Verify_that_is_visible(String s) {
       login.verify_enterdetails();
    }

    @Given("Fill details: Title, Name, Email, Password, Date of birth")
    public void Fill_details_Title_Name_Email_Password_Date_of_birth() {
       login.fill_details();
    }
}
