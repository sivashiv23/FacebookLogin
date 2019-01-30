package org.cucumber.com.cum.example;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class LoginSteps {
	static WebDriver driver;

	@Given("User should be in facebook home page")
	public void user_should_be_in_facebook_home_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sb61\\eclipse-workspace\\com.cum.example\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	@When("User gives input for username and password")
	public void user_gives_input_for_username_and_password(DataTable dataTable) {

		List<String> asList = dataTable.asList();
		driver.findElement(By.id("email")).sendKeys(asList.get(0));
		driver.findElement(By.id("pass")).sendKeys(asList.get(1));

	}

	@When("User Clicks on the submit button")
	public void user_Clicks_on_the_submit_button() {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();

	}

	@Then("user sees their home page")
	public void user_sees_their_home_page() {
		System.out.println("page displayed");
	}

}
