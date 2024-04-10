package StepDefinitions;

import PageObjects.LoginPage;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class steps {

    public WebDriver driver;
    public LoginPage lp;
    @Given("User Launch Chrome browser")
    public void user_Launch_Chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

       lp=new LoginPage(driver);

    }

    @When("User Opens URL {string}")
    public void user_Opens_URL(String url) {
        driver.get(url);
    }

    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_Email_as_and_Password_as(String email, String pwd) {
         lp.setUserName(email);
         lp.setPassword(pwd);
    }

    @When("User click on Login link")
    public void user_click_on_Login_link() {
        lp.login();
    }

    @Then("Page Title should be {string}")
    public void page_Title_should_be(String title) {

        if(driver.getPageSource().contains("Login wan unsuccessful.")){
            driver.close();
            Assert.assertTrue(false);
        }
        else{
            Assert.assertEquals(title,driver.getTitle());
        }

    }

    @When("User click on Log out link")
    public void user_click_on_Log_out_link() throws InterruptedException {
           lp.logout();
           Thread.sleep(3000);
    }

    @Then("close browser")
    public void close_browser() {
      driver.quit();
    }
}
