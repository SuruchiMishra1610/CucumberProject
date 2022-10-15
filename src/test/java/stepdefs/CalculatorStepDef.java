package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import org.junit.Assert;


public class CalculatorStepDef {
	
	int result = 0;
	
	@Given("I have a calculator")
	public void i_have_a_calculator() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Clculator Opened");
	}

	@When("I add {int} and {int}")
	public void i_add_and(int int1, int int2) {
	    // Write code here that turns the phrase above into concrete actions
	   
		result = int1+int2;
	}

	@Then("I should get the result as {int}")
	public void i_should_get_the_result_as(int expResult) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(expResult, result);
	}
	
	@When("I add the below numbers")
	public void i_add_the_below_numbers(List<Integer> numbers) {
		
		for(Integer num : numbers) {
			
			result = result + num;
		}
	}

}
