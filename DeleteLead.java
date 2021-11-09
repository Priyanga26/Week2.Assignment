package Week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
driver.findElement(By.xpath("//span[text()='Phone']")).click();
driver.findElement(By.name("phoneNumber")).sendKeys("98765");

driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

Thread.sleep(5000);

WebElement Leadid = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
String Print = Leadid.getText();
System.out.println(Print);

Leadid.click();
driver.findElement(By.linkText("Delete")).click();
Thread.sleep(5000);

driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys("12345");
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
driver.close();















	}

}
