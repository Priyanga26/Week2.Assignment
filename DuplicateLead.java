package Week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//label[text()='Email Address:']/following::input")).sendKeys("babu@testleaf.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);

		WebElement Firstlead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String lead = Firstlead.getText();
		System.out.println(lead);
		Firstlead.click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);

		driver.findElement(By.linkText("Create Lead")).click();

		driver.close();
		
	}

}
