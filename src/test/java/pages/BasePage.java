package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    
    WebDriver driver;
    protected static WebDriverWait wait;

    public BasePage(WebDriver rdriver)
    {
        this.driver=rdriver;
         PageFactory.initElements(rdriver, this);
        
    }
}

   
