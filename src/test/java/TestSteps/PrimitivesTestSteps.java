package TestSteps;

import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PrimitivesTestSteps {
    WebDriver driver;
    @Then("go to the {string}")
    public void go_to_the(String string) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to(string);
    }

    @Then("search when {string}")
    public void search_when(String string) {
        WebElement searchBox =driver.findElement(By.xpath(".//input[@class='gLFyf gsfi' and @type='text']"));
        searchBox.sendKeys(string+ Keys.ENTER);
    }
}
