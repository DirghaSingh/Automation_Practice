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

import helper.Predefined;
import helper.dropdowns;

public class RegisterUserPage extends BasePage
{

    private static String mail;
    
    dropdowns drp= new dropdowns();
    Predefined pre = new Predefined();
    //RegisterUserPage register= new RegisterUserPage(driver);

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

// public String firstname;

public void enter_details(){
    name_loc.sendKeys("Texting Practice");

    DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
     Calendar cal = Calendar.getInstance();

     Faker faker = new Faker();

    // Generate a fake name
    String firstname = faker.name().firstName();
    RegisterUserPage.mail = firstname + dateFormat.format(cal.getTime()) + "@yopmail.com";
     email_loc.sendKeys(mail);
}

public String getmail(){
    return RegisterUserPage.mail;
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

@FindBy(xpath = "//input[@id=\'password\']")
private WebElement password_loc;

@FindBy(xpath = "//select[@id='days']")
private WebElement day_loc;

@FindBy(xpath = "//select[@id='months']")
private WebElement month_loc;

@FindBy(xpath = "//select[@id='years']")
private WebElement year_loc;


public void fill_details(){
    title_loc.click();
    password_loc.sendKeys("Leverage@12");
    drp.selectdropdown(day_loc,"2");
    drp.selectdropdown(month_loc, "January");
    drp.selectdropdown(year_loc, "2020");

    pre.scrolldown();
}

@FindBy(xpath = "//*[@id='newsletter']")
private WebElement checkbox1;

@FindBy(xpath = "//*[@id='optin']")
private WebElement checkbox2;

public void check_box(){
    checkbox1.click();
    checkbox2.click();

}
@FindBy(xpath= "//input[@id='first_name']")
private WebElement firstname_loc;
@FindBy(xpath= "//input[@id='last_name']")
private WebElement lastname_loc;
@FindBy(xpath= "//input[@id='company']")
private WebElement companyname_loc;
@FindBy(xpath= "//input[@id='address1']")
private WebElement address1_loc;
@FindBy(xpath= "//input[@id='address2']")
private WebElement address2_loc;
@FindBy(xpath= "//input[@id='state']")
private WebElement state_loc;
@FindBy(xpath= "//input[@id='city']")
private WebElement city_loc;
@FindBy(xpath= "//input[@id='zipcode']")
private WebElement zipcode_loc;
@FindBy(xpath= "//input[@id='mobile_number']")
private WebElement mobile_number_loc;

public void address_information(){
    firstname_loc.sendKeys("Dirgha");
    lastname_loc.sendKeys("Singh");
    companyname_loc.sendKeys("LE");
    address1_loc.sendKeys("Sector 137");
    address2_loc.sendKeys("Noida");
    state_loc.sendKeys("UP");
    city_loc.sendKeys("Noida");
    zipcode_loc.sendKeys("201305");
    mobile_number_loc.sendKeys("1638729799");
}

@FindBy(xpath = "//button[@data-qa='create-account']")
private WebElement createbutton_loc;

public void create_account(){
    createbutton_loc.click();
}

@FindBy(xpath = "//h2[@data-qa='account-created']")
private WebElement accountcretaed_loc;

public void verify_account_created(){
    String textcreated = accountcretaed_loc.getText();
    String actualtext = "ACCOUNT CREATED!";
    Assert.assertEquals(textcreated, actualtext);
    System.out.println("Account creation verified");
}

@FindBy(xpath = "//a[@data-qa='continue-button']")
private WebElement continue_loc;

public void click_continue(){
    continue_loc.click();
}

@FindBy(xpath = "//ul[@class='nav navbar-nav']/li/a/b")
private WebElement loginname_loc;

public void loginnameuser(){
    String loginname = loginname_loc.getText();
    String actualloginname = "Texting Practice";
    Assert.assertEquals(loginname, actualloginname);
    System.out.println("Logged in user verified");
}

@FindBy(xpath = "//i[@class='fa fa-trash-o']")
private WebElement deleteaccount_loc;

public void deleteaccount(){
    deleteaccount_loc.click();
}

@FindBy(xpath = "//h2[@data-qa='account-deleted']")
private WebElement accountdeleted_loc;

@FindBy(xpath = "//a[@data-qa='continue-button']")
private WebElement Continubuttondelete_loc;

public void verifydeletedandclickcontinue(){
    String deletedtext=accountdeleted_loc.getText();
    String actualdeletedtext = "ACCOUNT DELETED!";
    Assert.assertEquals(deletedtext, actualdeletedtext);
    System.out.println("Account deleted");
    Continubuttondelete_loc.click();
}

public void alreadypresentemail(){
    name_loc.sendKeys("Texting Practice");
    pre.entersendkeys(email_loc,getmail());
}

@FindBy(xpath= "//form[@action='/signup']/p")
private WebElement alreadyemail;

public void alreadyemail(){
    String actualemailmessage = alreadyemail.getText();
    String expectedemailmessage = "Email Address already exist!";
    Assert.assertEquals(actualemailmessage, expectedemailmessage);
    System.out.println(actualemailmessage);
}
}
