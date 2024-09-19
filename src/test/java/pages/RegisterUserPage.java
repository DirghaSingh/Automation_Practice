package pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.github.javafaker.Faker;

public class RegisterUserPage extends BasePage
{
    
    public RegisterUserPage(WebDriver rdriver) {
        super(rdriver);
    }
    
public void verify_homepage(){

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("return document.readyState").toString().equals("complete");
}

@FindBy(xpath = "//a[text()=' Signup / Login']")
private WebElement SignUp_loc;

public void click_signup(){
    SignUp_loc.click();
    System.out.println("Clicked on signup button");
}

@FindBy(xpath = "//div[@class='signup-form']/h2")
private WebElement verify_newsignup;

public void verify_newsignup(){
    String signup_text= verify_newsignup.getText();
    System.out.println(signup_text);
    String actual_text = "New User Signup!";
    Assert.assertEquals(signup_text, actual_text);
}

@FindBy(xpath = "//input[@type='text']")
private WebElement name_loc;

@FindBy(xpath = "//input[@data-qa=\"signup-email\"]")
private WebElement email_loc;
public String mail;
public String firstname;

public void enter_details(){
    name_loc.sendKeys("Texting Practice");

    DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
     Calendar cal = Calendar.getInstance();

     Faker faker = new Faker();

    // Generate a fake name
    firstname = faker.name().firstName();
     String mail = firstname + dateFormat.format(cal.getTime()) + "@yopmail.com";
     email_loc.sendKeys(mail);
}

@FindBy(xpath = "//button[@data-qa='signup-button']")
private WebElement signup_button;

public void click_signupbutton(){
    signup_button.click();
}

@FindBy(xpath = "(//h2[@class=\"title text-center\"]/b)[1]")
private WebElement verify_enter;

public void verify_enterdetails(){
    String verifytext= verify_enter.getText();
    System.out.println(verifytext);
    String actual_verifytest="ENTER ACCOUNT INFORMATION";
    Assert.assertEquals(verifytext, actual_verifytest);
}

@FindBy(xpath = "//input[@id='id_gender1']")
private WebElement title_loc;

public void fill_details(){
    title_loc.click();
}
}
