package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActitimeLogin {
	WebDriver driver;
	@Given("User navigates to url {string}")
	public void user_navigates_to_url(String string) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(string);
	}

	@When("user enters valid username as {string}")
	public void user_enters_valid_username_as(String un) {
		driver.findElement(By.name("username")).sendKeys(un);
	}
	@And("user enters valid password as {string}")
	public void user_enters_valid_password_as(String pwd) {
		driver.findElement(By.name("pwd")).sendKeys(pwd);
	}
	@And("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.id("loginButton")).click();
	}
	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
		System.out.println(driver.getTitle());
	}
}
