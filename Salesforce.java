package Week2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
				
	driver.manage().window().maximize();
   	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

   	driver.findElement(By.name("UserFirstName")).sendKeys("Priya");
   	driver.findElement(By.name("UserLastName")).sendKeys("Vimal");
   	driver.findElement(By.name("UserEmail")).sendKeys("priyavimal@gmail.com");
   	driver.findElement(By.name("CompanyName")).sendKeys("IVTL");
   	driver.findElement(By.name("UserPhone")).sendKeys("9876543441");
   	WebElement Title = driver.findElement(By.name("UserTitle"));
   	Select JobTitle = new Select(Title);
   	JobTitle.selectByValue("IT_Manager_AP");
   	WebElement Company = driver.findElement(By.name("CompanyEmployees"));
   	Select EMP = new Select(Company);
   	EMP.selectByValue("950");
   	WebElement Country = driver.findElement(By.name("CompanyCountry"));
   	Select CountryName = new Select(Country);
   	CountryName.selectByVisibleText("United States");
   	WebElement Country1 = driver.findElement(By.name("CompanyState"));
   	Select CountryName1 = new Select(Country1);
   	CountryName1.selectByVisibleText("Florida");
    
   	WebElement check = driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following::div"));
check.click();
Thread.sleep(2000);

driver.close();


	}

}
