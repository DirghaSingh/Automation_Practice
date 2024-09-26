package steps;

import io.cucumber.java.en.Given;
import pages.LoginPage;

public class LoginSteps extends BaseSteps {
    

    LoginPage login = new LoginPage(driver);

    @Given("Click on Logout Button")
    public void Click_on_Logout_Button() {
        login.logout();
    }

    @Given("Verify Login to your account is visible")
    public void verify__login_account(){
        login.verify_logintext();
    }

    @Given("Enter correct email address and password")
    public void Enter_correct_email_address_and_password() {
        
        login.login_email();
    }

    @Given("Click login button")
    public void Click_login_button() {
        login.clicklogin();
    }


    @Given("Enter incorrect email address and password")
    public void Enter_incorrect_email_address_and_password() {
       login.loginincorrectmail();
    }

    @Given("Verify error {string} is visible")
    public void Verify_error_is_visible(String s) {
        login.incorrecttext();
    }    

}
