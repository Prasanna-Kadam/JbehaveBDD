package jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class Steps {
	
	@Given ("I am on google search page")
	public void searchPage() {
		System.out.println("On google page");
	}
	@When ("I enter Cricket keyword in search box")
	public void enterKeyword() {
		System.out.println("Enter Cricket");
	}
	@When ("Click on Search Icon")
	public void clickIcon() {
		System.out.println("Clicked on search icon");
	}
	
	@Then ("I should nevigate and display cricket info")
	public void onSearchedPage() {
		System.out.println("I am on searched Page");
	}
	

}
