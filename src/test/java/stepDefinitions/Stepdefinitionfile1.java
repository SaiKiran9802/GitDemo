package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitionfile1 {

	
	
	
	@Given("User is on NetBanking Landing page")
	public void user_is_on_net_banking_landing_page() {
		 System.out.println("User is on NetBanking Landing page");  
	}

	@When("User enters username (.+) password (.+)$")
	public void user_enters_username_password(String username, Integer password) {
	   System.out.println(username+":username "+password+": password");
	}
	@Then("Home page should be displyed")
	public void home_page_should_be_displyed() {
		 System.out.println("Home page should be displyed");
	}
	
	@When("User enters details")
	public void user_enters_details(List data) {
	    
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		
		
	}
		@Given("login to the bank")
		public void login_to_the_bank() {
		    System.out.println("this is background keyword to login into the bank account");
		}

		@Then("cards are displyed")
		public void cards_are_displyed() {
	System.out.println("Cards are displyed");
		}
		
		
		
		
		
	}



	
//	@Background("login to the application"){
		
	//}
	


	
	
	
	

