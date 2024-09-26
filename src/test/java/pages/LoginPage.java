package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.Predefined;

public class LoginPage extends BasePage {

    RegisterUserPage register= new RegisterUserPage(driver);
    Predefined pre = new Predefined();

    public LoginPage(WebDriver rdriver){
        super(rdriver);
    }

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    private WebElement logout_loc;

    public void logout(){
        logout_loc.click();
    }

    @FindBy(xpath = "//div[@class='login-form']/h2")
    private WebElement logintext_loc;

    public void verify_logintext(){
        String actuallogintext=logintext_loc.getText();
        String expectedText = "Login to your account";
        System.out.println(actuallogintext);
        Assert.assertEquals(actuallogintext,expectedText);
    }
   

    @FindBy(xpath = "//input[@data-qa='login-email']")
    private WebElement enteremail_loc;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    private WebElement enterpassword_loc;

    public void login_email(){

        pre.entersendkeys(enteremail_loc,register.getmail());
        enterpassword_loc.sendKeys("Leverage@12");
    }

    @FindBy(xpath = "//button[@data-qa='login-button']")
    private WebElement loginbutton_loc;

    public void clicklogin(){
        loginbutton_loc.click();
    }

    public void loginincorrectmail(){
        enteremail_loc.sendKeys("abc12@gmail.com");
        enterpassword_loc.sendKeys("Leverage@12");
    }

    @FindBy(xpath = "//form[@action='/login']/p")
    private WebElement incorrecttext_loc;

    public void incorrecttext(){
        String actualincorrcettext= incorrecttext_loc.getText();
        String expectedtextt = "Your email or password is incorrect!";
        System.out.println(actualincorrcettext);
        Assert.assertEquals(actualincorrcettext, expectedtextt);
    }


}
