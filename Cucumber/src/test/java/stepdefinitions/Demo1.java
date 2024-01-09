package stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;

public class Demo1 {
	@Given("Some pre-condition step")
	public void some_pre_condition_step(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> l = dataTable.asMaps();
		for(int i=0;i<l.size();i++) {
			System.out.print("First name: "+l.get(i).get("name")+" ");
			System.out.println("Last name: "+l.get(i).get("last name"));
		}
	}

}
