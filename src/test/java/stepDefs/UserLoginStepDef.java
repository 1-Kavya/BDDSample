package stepDefs;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginStepDef {
	
WebDriver driver;
ChromeOptions options;

@Given("User is on Login Page")
public void user_is_on_login_page() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().window().maximize();	  
	    driver.get("https://the-internet.herokuapp.com/login");
}

//User details hard coded in code
//@When("User enters credentials")
//public void user_enters_credentials() {
//		driver.findElement(By.id("username")).sendKeys("tomsmith");
//		//so have to use parameterization to more than one login
//		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.className("radius")).click();
//}


//parameterization and data from feature file
//@When("User enters {string} and {string}")
//public void user_enters_and(String strUser, String strPwd) {
//		driver.findElement(By.id("username")).sendKeys(strUser);
//		driver.findElement(By.name("password")).sendKeys(strPwd);
//		driver.findElement(By.className("radius")).click();
//}

//DataTable using Lists
//@When("User enters credentials")
//public void user_enters_credentials(DataTable userData) {
//	List<List<String>> data = userData.asLists();
//	
//	String strUser = data.get(0).get(0);			
//	String strPwd = data.get(0).get(1);
//	driver.findElement(By.id("username")).sendKeys(strUser);
//	driver.findElement(By.name("password")).sendKeys(strPwd);
//	driver.findElement(By.className("radius")).click();
//}

//DataTable using Maps
@When("User enters credentials")
public void user_enters_credentials(DataTable userData) {
	List<Map<String, String>> data = userData.asMaps();
	
	String strUser = data.get(0).get("username");			
	String strPwd = data.get(0).get("password");
	driver.findElement(By.id("username")).sendKeys(strUser);
	driver.findElement(By.name("password")).sendKeys(strPwd);
	driver.findElement(By.className("radius")).click();
}

//for hardcode and parameterization
//@Then("Should display success message")
//public void should_display_success_message() {
//    
//	boolean isUserValid = driver.findElement(By.cssSelector("div.flash success")).isDisplayed();
//	Assert.assertTrue(isUserValid);
//}

@Then("Should display success message")
public void should_display_success_message(DataTable userData) {
    
	List<String> msgList = userData.asList();
	String strMsg = msgList.get(0);
//	"xpath[contains(text(), '" + strMsg + " ')]"
	boolean isUserValid = driver.findElement(
			By.xpath("//div[contains(text(), '" + strMsg + "')]")).isDisplayed();
	Assert.assertTrue(isUserValid);
	
}

}
