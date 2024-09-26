package pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.Predefined;

public class ContactUsFormPage extends BasePage {

    Predefined pre = new Predefined();

    public ContactUsFormPage(WebDriver rdriver) {
        super(rdriver);
    }

    @FindBy(xpath = "//i[@class='fa fa-envelope']")
    private WebElement contactbutton_loc;

    public void contact(){
        contactbutton_loc.click();
    }

    @FindBy(xpath = "//div[@class='contact-form']/h2")
    private WebElement getintouchtext_loc;

    public void getintouch(){
    String actualtextmessage = getintouchtext_loc.getText();
    String expectedtextmessage = "GET IN TOUCH";
    Assert.assertEquals(actualtextmessage, expectedtextmessage);
    System.out.println(actualtextmessage);
    }

    @FindBy(xpath = "//input[@name='name']")
    private WebElement name_loc;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement email_loc;
    @FindBy(xpath = "//input[@name='subject']")
    private WebElement subject_loc;
    @FindBy(xpath = "//textarea[@name='message']")
    private WebElement textarea_loc;
    @FindBy(xpath = "//input[@name='upload_file']")
    private WebElement choosefile_loc;

    public void fillcontactus(){
        pre.entersendkeys(name_loc, "Dirghafile");
        pre.entersendkeys(email_loc, "dirgha19@gmail.com");
        pre.entersendkeys(subject_loc, "file upload");
        pre.entersendkeys(textarea_loc, "new file upload");
        WebElement fileInput = driver.findElement(By.xpath("//input[@name='upload_file']"));
        fileInput.sendKeys("C://Users//dirghasingh//Desktop//Capture.png");
    }

    @FindBy(xpath= "//input[@data-qa='submit-button']")
    private WebElement submitbutton_loc;

    public void submitform(){
        pre.scrolldown();
        pre.click(submitbutton_loc);
    }

    public void acceptalert(){
     Alert alert = driver.switchTo().alert(); // switch to alert
    driver.switchTo().alert().accept();
    pre.scrollup();
    }

    @FindBy(xpath ="//div[@class='status alert alert-success']")
    private WebElement verifycontacttext_loc;

    public void verfiycontacttext(){
        String actualcontactmessage = verifycontacttext_loc.getText();
         String expectedcontacttmessage = "Success! Your details have been submitted successfully.";
        Assert.assertEquals(actualcontactmessage, expectedcontacttmessage);
        System.out.println(actualcontactmessage);
    }

    @FindBy(xpath= "//a[@class='btn btn-success']")
    private WebElement homebutton_loc;

    public void homebutton(){
        pre.click(homebutton_loc);
    }
    }
    
