package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerSteps {
	
	static WebDriver driver;
	
	@Given("user launches demo telecom site")
	public void user_launches_demo_telecom_site() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\cucumber\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		Thread.sleep(3000);
		 driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"flow_close_btn_iframe\"]")));
		 driver.findElement(By.id("closeBtn")).click();
		 driver.switchTo().parentFrame();
	}

	@Given("user clicks on add customer button")
	public void user_clicks_on_add_customer_button() throws Exception {
	driver.findElement(By.xpath("(//a[text()='Add Customer'][1])")).click();
	Thread.sleep(5000);
	   driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"flow_close_btn_iframe\"]")));
		 driver.findElement(By.id("closeBtn")).click();
		 driver.switchTo().parentFrame();
	}

	@When("user enters all the fields")
	public void user_enters_all_the_fields() {
		driver.findElement(By.xpath("//label[@for='done'][1]")).click();
		driver.findElement(By.id("fname")).sendKeys("joe");
		driver.findElement(By.id("lname")).sendKeys("josef");
		driver.findElement(By.id("email")).sendKeys("djd@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("tambaram");
		driver.findElement(By.id("telephoneno")).sendKeys("9884739293");
	}

	@When("user clicks on the submit button")
	public void user_clicks_on_the_submit_button() throws Exception {
	driver.findElement(By.xpath("//input[@value='Submit'][1]")).click();
	 Thread.sleep(3000);
	  driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"flow_close_btn_iframe\"]")));
		 driver.findElement(By.id("closeBtn")).click();
		 driver.switchTo().parentFrame();
	}

	@Then("user should be displayed customer ID is generated or not")
	public void user_should_be_displayed_customer_ID_is_generated_or_not() {
		org.junit.Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center'][2]")).isDisplayed());
		String text = driver.findElement(By.xpath("(//td[@align='center'])[2]")).getText();
		   System.out.println(text);

	}


}
