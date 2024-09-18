package steps;

import io.cucumber.java.en.Given;

public class RegisterUser extends BaseSteps{
    
    @Given("User open")
    public void open_url(){
        driver.get("https://automationexercise.com/");
    }
}
