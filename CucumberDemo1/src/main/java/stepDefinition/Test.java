package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {
	@Given("^I am a manual tester$")
	public void I_am_a_Manual_tester()
	{
		System.out.println("I am a manual tester");
	}
	
	@When("^I apply for new Job$")
	public void I_apply_for_new_Job()
	{
		System.out.println("I apply for new Job");
	}
	@Then("^I get less pay$")
	public void I_get_less_pay()
	{
		System.out.println("I get less pay");
	}
	@And("^I am not astisfied with my job$")
	public void I_am_not_satisfied_with_my_job()
	{
		System.out.println("I am not satisfied with my job");
	}
	@But("^my parents satisfied with it$")
	public void my_parents_satisfied_with_it()
	{
		System.out.println("my parents satisfied with it");
	}

}
