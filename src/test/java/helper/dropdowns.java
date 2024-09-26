package helper;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {
    
    public void selectdropdown(WebElement ele,String value){

        Select dropdown = new Select(ele);
        List<WebElement> alloptions= dropdown.getOptions();
        for(WebElement option: alloptions){
            if(option.getText().equals(value)){
                option.click();
            }
        } 


        
    }
}
