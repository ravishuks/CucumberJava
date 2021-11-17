package Execution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	WebDriver driver = null;
	
	@Given("Open the web browser")
	public void open_the_web_browser() {
	    
		String StrChromeDriverPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", StrChromeDriverPath+"/drivers/chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver",StrChromeDriverPath+"/drivers/geckodriver.exe");
		//driver = new ChromeDriver();
		
		driver= new FirefoxDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	    driver.manage().window().maximize();
	    
	}

	@And("navigate to google.com")
	public void navigate_to_google_com() {
	    driver.get("http://www.google.com");
   
    
	}

	@When("enter the text in the search box")
	public void enter_the_text_in_the_search_box() {
		
		driver.findElement(By.name("q")).sendKeys("Automate the search");
	}

	@And("click on the seach button")
	public void click_on_the_seach_button() {
	    
		driver.findElement(By.name("btnK")).click();
	}

	@Then("user is navigated to the search results")
	public void user_is_navigated_to_the_search_results() {
	    
		driver.getPageSource().contains("Python");
		
		driver.quit();
	}

}
