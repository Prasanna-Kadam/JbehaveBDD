package jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

	WebDriver driver;

	@Given ("I am on login page of tools Qa site")
	public void goToUrl() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoqa.com/login");
		System.out.println("On login page");
		
	}


	@When ("I enter valid username")
	public void enterUsername() throws Exception {
		//driver.findElement("login").click();
		//Thread.sleep(2000);
		Thread.sleep(3000);
		driver.findElement(By.id("userName")).sendKeys("Test");
		System.out.println("Enter Username successfully");
	}

	@When ("I enter valid password")
	public void EnterPass () {
		driver.findElement(By.id("password")).sendKeys("Talent_123!");
		System.out.println("Enter Pass successfully");
	}
	
	@Then ("I am able to login successfully and redirected to Home")
	public void clickOnLogin() {
		driver.findElement(By.id("login")).click();
		System.out.println("Clicked on login button");
	}



}
