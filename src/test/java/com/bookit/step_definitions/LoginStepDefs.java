package com.bookit.step_definitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bookit.pages.MapPage;
import com.bookit.pages.SignInPage;
import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefs {
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		String url = ConfigurationReader.getProperty("url");
	    Driver.getDriver().get(url);
		
	}

	@When("the user logs in as teacher")
	public void the_user_logs_in_as_teacher() {
		String username = ConfigurationReader.getProperty("teacher_email");
		String password = ConfigurationReader.getProperty("teacher_password");
		
		SignInPage signInPage = new SignInPage();
		signInPage.email.sendKeys(username);
		signInPage.password.sendKeys(password);
		
		signInPage.Login();
	}
	
	@When("the user logs in as team lead")
	public void the_user_logs_in_as_team_lead() {
		String username = ConfigurationReader.getProperty("team_leader_email");
		String password = ConfigurationReader.getProperty("team_leader_password");
		
		SignInPage signInPage = new SignInPage();
		signInPage.email.sendKeys(username);
		signInPage.password.sendKeys(password);
		
		signInPage.Login();
	}
	
	@When("the user logs in using {string} and {string}")
	public void the_user_logs_in_using_and(String username, String password) {
		
		SignInPage signInPage = new SignInPage();
		signInPage.email.sendKeys(username);
		signInPage.password.sendKeys(password);
		
		signInPage.Login();
	}


	@Then("the user should be logged in")
	public void the_user_should_be_logged_in() {
		MapPage mapPage = new MapPage();
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		Assert.assertTrue(mapPage.map.isDisplayed());
	}
	
	@Then("there should be {int} rooms")
	public void there_should_be_rooms(Integer rooms) {
	    System.out.println("There are " + rooms + " rooms.");
	}
	
}
