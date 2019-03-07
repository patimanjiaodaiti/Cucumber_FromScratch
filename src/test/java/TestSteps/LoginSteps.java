package TestSteps;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    public WebDriver driver;

    @Given("browser is opened")
    public void browser_is_opened() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @When("website is uploaded")
    public void website_is_uploaded() {
        driver.navigate().to("https://www.google.com");
        driver.findElement(By.linkText("Sign in")).click();
    }

    @When("user enter username and password")
    public void user_enter_username_and_password() throws InterruptedException {
        WebElement email=driver.findElement(By.xpath(".//input[@type='email']"));
        email.sendKeys("patima0218@gmail.com" + Keys.ENTER);
        WebElement password= driver.findElement(By.xpath(".//input[@type=\"password\" and @class=\"whsOnd zHQkBf\"] "));
        password.sendKeys("rabbemalla"+Keys.ENTER);
    }
    @Then("user search something using search box")
    public void user_search_something_using_search_box() {

    }

    @Then("user click gmail")
    public void user_click_gmail() {

    }

    @Then("user click images")
    public void user_click_images() {

    }

    @Then("user logs out")
    public void user_logs_out() {

    }
//    @After
//    public void CloseBrowser(){
//        new Actions(driver).pause(2000).perform();
//        driver.quit();
//    }

}