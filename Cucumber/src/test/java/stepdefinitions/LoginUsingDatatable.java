package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginUsingDatatable {
	WebDriver driver;
	@Given("User is present in actitime login page")
	public void user_is_present_in_actitime_login_page() {
		driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password(io.cucumber.datatable.DataTable d) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    // For other transformations you can register a DataTableType.
		List<String> l = d.asList();
		String un = l.get(0);
		String pwd = l.get(1);
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
	}

	@Then("click on login button to go to home page")
	public void click_on_login_button_to_go_to_home_page() {
		driver.findElement(By.id("loginButton")).click();
	}

}
