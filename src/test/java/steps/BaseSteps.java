package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSteps {
    

    public static WebDriver driver;
    public static Boolean driverStayOpen=false;
	
     public void setDriver() {
        WebDriverManager.chromedriver().driverVersion("127.0.6533.100").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        //driver.get("https://automationexercise.com/");

    }

}