package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Steps {
	
	WebDriver driver;
	@Before
	public void beforetest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayasrp2\\Documents\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void aftertest() {
		driver.close();
	}
	
	@Given("I am able to navigate onto login page")
	public void i_am_able_to_navigate_onto_login_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
			    
	}


	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String string) {
		driver.findElement(By.name("txtUsername")).sendKeys(string);
			    
	}
	
	@When("I enter the password as {string}")
	public void i_enter_the_password_as(String string) {
		driver.findElement(By.id("txtPassword")).sendKeys(string);
	}
	
	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String string) throws InterruptedException {
		String expected =driver.findElement(By.id("welcome")).getText();
		Thread.sleep(3000);
		Assert.assertEquals(expected, string);
		Thread.sleep(3000);
	}
	
	@Then("I should see the error as {string}")
	public void i_should_see_the_error_as(String string) throws InterruptedException {
		String expected =driver.findElement(By.xpath("//*[text()='Invalid credentials']")).getText();
		Assert.assertEquals(expected, string);
	}


}
