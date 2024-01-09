package stepdefinitions;

import io.cucumber.java.en.Given;

public class DemoPassingData {
	@Given("The username of my facebook is {string}")
	public void the_username_of_my_facebook_is(String username) {
		System.out.println("The username of my facebook is "+username);
	}

	@Given("The contact number is {int}")
	public void the_contact_number_is(Integer int1) {
		System.out.println("The contact number is "+int1);
	}

	@Given("The salary is {double}")
	public void the_salary_is(Double double1) {
		System.out.println("The salary is "+double1);
	}


}
