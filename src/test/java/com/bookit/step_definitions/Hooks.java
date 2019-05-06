package com.bookit.step_definitions;

import java.util.concurrent.TimeUnit;

import com.bookit.utilities.Driver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void setup() {
		
	}
	
	@After
	public void teardown() {
		Driver.closeDriver();
	}
}
