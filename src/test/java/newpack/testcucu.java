package newpack;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testcucu {

@Given("^I want to write a step with precondition$")
public void i_want_to_write_a_step_with_precondition() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("1");
}

@When("^I complete action$")
public void i_complete_action() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("2");
}

@Then("^I validate the outcomes$")
public void i_validate_the_outcomes() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("3");
}

@Given("^This is abc(\\d+) and abc(\\d+)$")
public void this_is_abc_and_abc(int arg1, int arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//System.out.println(arg1,arg2);
}

@When("^At the point when this is required$")
public void at_the_point_when_this_is_required() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^It is enter in it then submitted$")
public void it_is_enter_in_it_then_submitted() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
}

@Given("^This is xyz(\\d+) and xyz(\\d+)$")
public void this_is_xyz_and_xyz(int arg1, int arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
}

@Given("^This is asfs and assf$")
public void this_is_asfs_and_assf() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 
}

@Given("^This is <username> and <password>$")
public void this_is_username_and_password(DataTable arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
    List<Map<String,String>> credentials = arg1.asMaps(String.class, String.class);
    for(int i=0;i<credentials.size();i++) {
    	
    	System.out.println(credentials.get(i).get("username")+"\t"+credentials.get(i).get("password"));
    	
    }
}
}
