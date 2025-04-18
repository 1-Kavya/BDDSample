package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookSearchStepDef {	
	WebDriver driver;

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	    driver.get("https://danube-webshop.herokuapp.com/");
	
	}
	@When("User search Novels & Stories")
	public void user_search_novels_stories() {
		driver.findElement(By.xpath("//a[contains(text(),'Novels & Stories')]")).click();
	      
	}
	@Then("Should display novel result page")
	public void should_display_novel_result_page() {
		String strURL = driver.getCurrentUrl();
	    Assert.assertTrue(strURL.contains("novel"));
	}
		
	@When("User search Crime & Thrillers")
	public void user_search_crime_thrillers() {
		driver.findElement(By.xpath("//a[contains(text(), 'Crime & Thrillers')]")).click();
	    
	}
	@Then("Should display crime result page")
	public void should_display_crime_result_page() {
		String strURL = driver.getCurrentUrl();
	      Assert.assertTrue(strURL.contains("crime"));
	}

	@After //After is java hook, used to execute method after each scenario
	public void attachScreen(Scenario scenario) {
		if (scenario.isFailed()) {
			TakesScreenshot screen = (TakesScreenshot)driver;
			byte[] img = screen.getScreenshotAs(OutputType.BYTES);
			scenario.attach(img, "image/png", "FailedScenarioImage");
		}
	}
	
	
}
