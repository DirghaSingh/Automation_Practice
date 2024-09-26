package helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static steps.BaseSteps.driver;

public class Predefined {

    public void click(WebElement ele){
        ele.click();
    }
    
    public void entersendkeys(WebElement ele,String value){

        ele.sendKeys(value);
    }
   
    public void scrolldown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)","");
    }

    public void scrollup(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-250)","");
    }


        
    }

