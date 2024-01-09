package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginUsingHeaders {
	WebDriver driver;
	@Given("User navigates to url")
	public void user_navigates_to_url() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
	}

	@When("he enters valid credentials")
	public void he_enters_valid_credentials(io.cucumber.datatable.DataTable d) {
		List<Map<String, String>> l = d.asMaps();
		String un = l.get(0).get("username");
		String pwd = l.get(0).get("password");
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
	}

}
