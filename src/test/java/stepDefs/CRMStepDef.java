package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDef {
//	feature --> scenario --> step
//	
//@BeforeAll
//public static void setupBrowser() {
//	System.out.println("Before All the scenarios..............");
//}
//
//@AfterAll
//public static void closeBrowser() {
//	System.out.println("After All the scenarios............");
//}

	//tagged hooks Prerequisites or post requisites
	
//@Before("@SmokeTest")
//public void setupDataSmoke() {
//		System.out.println("Before Each Smoke scenario.....");
//}
//
//@After("@SmokeTest")
//public void closeDBSmoke() {
//		System.out.println("After Each Smoke scenario.....");
//}
//
//@Before("@RegressionTest")
//public void setupDataRegression() {
//		System.out.println("Before Each Regression scenario.....");
//}
//
//@After("@RegressionTest")
//public void closeDBRegression() {
//		System.out.println("After Each Regression scenario.....");
//}

//@Before(order=2)
//public void setupDataRegression() {
//		System.out.println("Before Each Regression scenario.....");
//}
//	
//@Before(order=1)
//public void readPropertyFile() {
//		System.out.println("Read From Property File.....");
//}
//
//@Before(order=3)
//public void initBrowser() {
//		System.out.println("Initial Browser.....");
//}
	
	//ordering the tagged hooks
	@Before(value="@SmokeTest", order=1)
	public void readPropertySmoke() {
			System.out.println("Read From Smoke Property File.....");
	}
	
	@Before(value="@RegressionTest", order=2)
	public void setupDataRegression() {
			System.out.println("Before Each Regression scenario.....");
	}
	
	@Before(value="@SmokeTest", order=2)
	public void setupDataSmoke() {
			System.out.println("Before Each Smoke scenario.....");
	}
	
	@Before(value="@RegressionTest", order=1)
	public void readPropertyRegr() {
			System.out.println("Read From Regression Property File.....");
	}
	
	
	

@Given("User is logged in")
public void user_is_logged_in() {
    System.out.println("User is logged in");
}

@When("User create a new Contact")
public void user_create_a_new_contact() {
	System.out.println("User create a new Contact");
}

@When("User view Contact details")
public void user_view_contact_details() {
	System.out.println("User view Contact details");
}

@When("User delete a Contact")
public void user_delete_a_contact() {
	System.out.println("User delete a Contact");
}

@When("User create a new Deals")
public void user_create_a_new_deals() {
	System.out.println("User create a new Deals");
}

@When("User view Deal details")
public void user_view_deal_details() {
	System.out.println("User view Deal details");
}


@When("User delete a Deals")
public void user_delete_a_deals() {
	System.out.println("User delete a Deals");
}


@When("User create a new Tasks")
public void user_create_a_new_tasks() {
	System.out.println("User create a new Tasks");
}


@When("User view Tasks details")
public void user_view_tasks_details() {
	System.out.println("User view Tasks details");
}

@When("User delete a Tasks")
public void user_delete_a_tasks() {
	System.out.println("User delete a Tasks");
}




}
