package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsDefinition {
	WebDriver driver;

	@When("User is on login Page")
	public void user_is_on_login_page() {
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		driver.
	   
	}

	@When("User click on Login page")
	public void user_click_on_login_page() {

	}

	@Then("User verify the error message")
	public void user_verify_the_error_message() {

	}

}
