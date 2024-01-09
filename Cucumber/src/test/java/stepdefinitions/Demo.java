package stepdefinitions;

import java.util.List;

import io.cucumber.java.en.Given;

public class Demo {
	@Given("Some precondition step")
	public void some_precondition_step(io.cucumber.datatable.DataTable d) {
		List<String> al = d.asList();
		for (String name : al) {
			System.out.println(name);
		}
	}

	
}
