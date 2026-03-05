package CucumberProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {

    WebDriver driver;

    @Given("User navigate to the login page")
    public void user_navigate_to_the_login_page() {
        driver=new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
    }
    @When("User enter valid credentials")
    public void user_enter_valid_credentials(){
    	driver.findElement(By.name("email")).sendKeys("hn@gmail.com");
    	driver.findElement(By.name("password")).sendKeys("hn@123");    	
    }
    @And("Click on login button")
    public void  click_on_login_button(){
    	driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
    	
    }
    @Then("User should be able to access the account")
    public void  user_should_be_able_to_access_the_account(){
    	driver.findElement(By.xpath("//h2[text()=\"My Account\"]"));
    	System.out.println("User is logged in");
    }
}