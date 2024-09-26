package steps;

import io.cucumber.java.en.Given;
import pages.ContactUsFormPage;

public class ContactUsFormSteps extends BaseSteps {

    ContactUsFormPage contact = new ContactUsFormPage(driver);

    @Given("Click on Contact Us button")
    public void clickcontact(){
        contact.contact();
    }

    @Given("Verify GET IN TOUCH is visible")
    public void Verify_GET_IN_TOUCH_is_visible() {
        contact.getintouch();
    }

    @Given("Enter name, email, subject and message")
    public void Enter_name_email_subject_and_message() {
        contact.fillcontactus();
    }

    @Given("Click Submit button")
    public void Click_Submit_button() {
        contact.submitform();
    }

    @Given("Click OK button")
    public void Click_OK_button() {
        contact.acceptalert();
    }

    @Given("Verify success message Success! Your details have been submitted successfully. is visible")
    public void Verify_success_message_Success_Your_details_have_been_submitted_successfully_is_visible() {
        contact.verfiycontacttext();
    }

    @Given("Click Home button and verify that landed to home page successfully")
    public void Click_Home_button_and_verify_that_landed_to_home_page_successfully() {
       contact.homebutton();
    }
    
    
}
