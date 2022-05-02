package Stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;
	@Given("User in google home page")
	public void user_in_google_home_page() {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium projects\\seleniumtestngprojects\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		
	}
		@Given ("google title test")
		public void google_title_test() {
			String title=driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "Google");
		}
		@When ("user in Game on mobile homepage")
		public void user_in_instagram_home_page()  {
			driver.navigate().to("https://app.gameonmobile.com/create-account");
			boolean b=driver.findElement(By.xpath("//img[contains(@alt,'Game On Mobile')]")).isDisplayed();
			 Assert.assertTrue(b);
	
		
		}

		
		@When ("Game on mobile title test")
		public void Instagram_title_test() throws InterruptedException  {
		    System.out.println(driver.getTitle());
		   
		}


		@When("user enters (.*) and (.*) and (.*) and (.*)$")
		public void user_enters_details(String firstname, String lastname,String email,int index) 
		{
		
			driver.findElement(By.name("first-name")).sendKeys(firstname);
			driver.findElement(By.name("last-name")).sendKeys(lastname);
			driver.findElement(By.name("email-address")).sendKeys(email);
			Select select=new Select(driver.findElement(By.name("country")));
		select.selectByIndex(index);
	
		}


	    @Then ("user clicks submit")
	    public void submit()
		{
			driver.findElement(By.xpath("//a[contains(text(),' Create an Account ')]")).click();
			driver.close();
		}
	    
}
