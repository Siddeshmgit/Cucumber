package stepdefinitions;
import io.cucumber.java.en.Given;
public class Demo3 {
	@Given("credentials are given {string} , {string} , {string}")
	public void credentials_are_given(String string, String string2, String string3) {
		System.out.println(string+string2+string3);
	}
}