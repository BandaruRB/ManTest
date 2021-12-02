package TestOnePack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestOne {

	public static void main(String[] args) 
	{
		System.out.println("WelcomeSoftware Testing");
		
		System.getProperty("webdriver.chrome.driver","path of the chrome.exe");
		
	

		WebDriver driver=new ChromeDriver();

			driver.get("https://www.google.co.in");
			
			driver.getTitle();
			driver.navigate().to("https://www.facebook.com");
			driver.navigate().back();
			driver.navigate().forward();


			driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Ram");

			Locators in Selenium:
			Id,
			name,
			class,
			xpath,
			cssSelector,
			linkText,
			partiallinkText,
			tagName

			WebElement drop1=driver.findElement("//select[@id='day']");
			
			Select se=new Select(drop1);

			se.selectByVisibleText("");
			se.selectByIndex(2);
			se.selectByValue("");

			List<WebElement> li=new List<WebElement>();

			for(WebElement we:li)
			{
				we.getText();
			}


			driver.manage().timeouts().implecitlyWait(timeouts, TimeUnits.SECONDS);

			
			WebDriverWait wait=new WebDriverWait(driver,10);

			wait.until(ExpectedCondition.presenceOfElementLocated(By.xpath("//input[@id='lastname']")));

			
			Alert alt=driver.navigateTo().alert();

			alt.accept();
			alt.dismiss();


		Constructor:

			Class Demo
			{
				
			Demo()
			{
				System.out.println("default constructor");
			}

			Demo(int a, int b)
			{
				System.out.println("parameterized constructor");
			}
			public static void main(String args[])
			{
				Demo d=new Demo();// default constructor will call here
				Demo d=new Demo(10,20);// parameterized constructor will call here
				
			}
			}	


		Cucumber: 

		BDD framework

		Gherkin language

			Feature file
			Step definition file
			Test Runner file
			POM.xml for all dependencies

			Feature file:
			Feature:
			Scenario:
			Given:
			When:
			Then:
			And:
			But

			Step Definition file:
				
			Its contains the java code which is belongs to feature file by using annotations
			
			@Given("^Login the webpage$")
			public void Login_method()
			{

			}
			@When("^Launch the page$")
			public void Launch_method()
			{

			}

			TestRunner file:
			feature: path of the feature file
			glue: path of the step definistion file
			monochrome: good and readable formatted output will displayed in console
			format: report should be displayed in required format like html, JS....
			dryRun: run all the steps which are available in step definition file
			
				









	}

}
