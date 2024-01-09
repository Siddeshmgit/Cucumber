package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Education {
	@Given("Student has cleared SSLC examinations")
	public void student_has_cleared_sslc_examinations() {
		System.out.println("Student has cleared SSLC examinations");
	}

	@When("student has scored more than distinction")
	public void student_has_scored_more_than_distinction() {
		System.out.println("student has scored more than distinction");
	}

	@Then("he is allowed to join PUC")
	public void he_is_allowed_to_join_puc() {
		System.out.println("he is allowed to join PUC");
	}

	@Given("The student has cleared boards for PCMB")
	public void the_student_has_cleared_boards_for_pcmb() {
		System.out.println("The student has cleared boards for PCMB");
	}

	@When("He writes neet exam")
	public void he_writes_neet_exam() {
		System.out.println("He writes neet exam");
	}

	@And("he clears the exam")
	public void he_clears_the_exam() {
		System.out.println("he clears the exam");
	}

	@Then("he will be able to join MBBS")
	public void he_will_be_able_to_join_mbbs() {
		System.out.println("he will be able to join MBBS");
	}

	@Given("The student has cleared boards for PCMC")
	public void the_student_has_cleared_boards_for_pcmc() {
		System.out.println("The student has cleared boards for PCMC");
	}

	@When("he writes CET exam")
	public void he_writes_cet_exam() {
		System.out.println("he writes CET exam");
	}

	@And("he ranks below ten thousand")
	public void he_ranks_below_ten_thousand() {
		System.out.println("he ranks below ten thousand");
	}
	@Then("he will be able to join engineering")
	public void he_will_be_able_to_join_engineering() {
		System.out.println("he will be able to join engineering");
	}

}
