package steps;

import io.cucumber.java.en.Given;
import pages.RegisterUserPage;

public class RegisterUserSteps extends BaseSteps{

    RegisterUserPage register = new RegisterUserPage(driver);
    
    @Given("User navigates to home page")
    public void open_url(){
        driver.get("https://automationexercise.com/");
    }

    @Given("Verify that home page is visible successfully")
    public void Verify_that_home_page_is_visible_successfully() {
         register.verify_homepage();
    }

    @Given("Click on {string} button")
    public void Click_on_button(String s) {
        register.click_signup();
    }

    @Given("Verify {string} is visible")
    public void Verify_is_visible(String s) {
       register.verify_newsignup();
    }

    @Given("Enter name and email address")
    public void Enter_name_and_email_address() {
        register.enter_details();
    }

    @Given("Click {string} button")
    public void Click_button(String s) {
        register.click_signupbutton();
    }

    @Given("Verify that {string} is visible")
    public void Verify_that_is_visible(String s) {
       register.verify_enterdetails();
    }

    @Given("Fill details: Title, Name, Email, Password, Date of birth")
    public void Fill_details_Title_Name_Email_Password_Date_of_birth() {
       register.fill_details();
    }

    @Given("Select checkbox1 {string}")
    public void Select_checkbox1(String s) {
        register.check_box();
    }

    @Given("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void Fill_details_First_name_Last_name_Company_Address_Address_Country_State_City_Zipcode_Mobile_Number() {
        register.address_information();
    }

    @Given("Click {string}")
    public void Click(String s) {
       register.create_account();
    }

    @Given("Verify that ACCOUNT CREATED! is visible")
        public void Verify_account(){
            register.verify_account_created();
        }

    @Given("Verify and Click on {string} button")
    public void Verify_and_Click_on_button(String s) {
        register.click_continue();
    }

    @Given("Verify that Logged in as username is visible")
    public void Verify_that_Logged_in_as_username_is_visible() {
        register.loginnameuser();
    }

    @Given("Click Delete Account button")
    public void Click_Delete_Account_button() {
        register.deleteaccount();
    }

    @Given("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void Verify_that_ACCOUNT_DELETED_is_visible_and_click_Continue_button() {
        register.verifydeletedandclickcontinue();
    }

    @Given("Enter name and already registered email address")
    public void Enter_name_and_already_registered_email_address() {
     register.alreadypresentemail();   
    }

    @Given("Verify error Email Address already exist! is visible")
    public void Verify_error_Email_Address_already_exist_is_visible() {
        register.alreadyemail();
    }
    }


