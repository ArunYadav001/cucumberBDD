package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageobjects.LoginPage;

public class loginSteps {

   public WebDriver driver;
   public LoginPage loginPage;

        @Given("User launches a browser")
        public void user_launches_a_browser() {
             System.setProperty("webdriver.chrome.driver", "C:\\Users\\arun.y\\chromeDriver\\chromedriver.exe");
            driver = new ChromeDriver();
             loginPage = new LoginPage(driver);


        }
        @When("User opens a url {string}")
        public void user_opens_a_url(String url) {
          driver.get(url);
        }
        @When("User enters Email as {string} and Password as {string}")
        public void user_enters_email_as_and_password_as(String email, String pass) {
           loginPage.enterUserName(email);
           loginPage.enterPassword(pass);
        }
        @When("Click on Login")
        public void click_on_login() {
         loginPage.clickLogin();
        }
        @Then("Page title should be {string}")
        public void page_title_should_be(String string) {
           if(driver.getPageSource().contains("Login was unsuccessful.")){
                driver.close();
                Assert.assertTrue(false);
           }
           else{
                Assert.assertEquals(string,driver.getTitle());
           }
        }
        @When("user click on log out link")
        public void user_click_on_log_out_link() throws InterruptedException {
          loginPage.clickLogout();
          Thread.sleep(3000);
        }
        @Then("close the browser")
        public void close_the_browser() {
          driver.quit();
        }


    }

