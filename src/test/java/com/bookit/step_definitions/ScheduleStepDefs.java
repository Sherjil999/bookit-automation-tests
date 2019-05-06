package com.bookit.step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScheduleStepDefs {

	@When("the user goes to my schedule")
	public void the_user_goes_to_my_schedule() {
	    System.out.println("the user goes to my schedule");
	}

	@Then("he should be able to see reservation for his team")
	public void he_should_be_able_to_see_reservation_for_his_team() {
		System.out.println("he should be able to see reservation for his team");
	}
}
