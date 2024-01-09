package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MultipleLogin {
	WebDriver driver;
	@Given("Dinga is present in actitime login page")
	public void dinga_is_present_in_actitime_login_page() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
	}

	@When("He enters valid username and password as {string} and {string}")
	public void he_enters_valid_username_and_password_as_and(String un, String pwd) {
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("loginButton")).click();
	}

	@Then("home page of actitime will be displayed")
	public void home_page_of_actitime_will_be_displayed() {
	}

	@When("He enters invalid username and password as {string} and {string}")
	public void he_enters_invalid_username_and_password_as_and(String string, String string2) throws InterruptedException {
	Thread.sleep(2000);
		System.out.println(driver.getTitle());
	}

	@Then("home page of actitime will not be displayed")
	public void home_page_of_actitime_will_not_be_displayed() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	}

}
