package steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseSteps{
    
    @Before
    public void setUp(Scenario scenario) throws IOException {
        System.out.println("------------Scenario :" + scenario.getName()+"----------");

        if(driverStayOpen==false)
        {
        setDriver();
        }
    }

        @After
     public void tearDown(Scenario scenario) throws IOException {
        
        if(driverStayOpen==true){
            TakesScreenshot ts = (TakesScreenshot)driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            File trg = new File(".//screenshot//screenshot2.png");
            FileUtils.copyFile(src, trg);
        }

        driver.quit();
}
    }