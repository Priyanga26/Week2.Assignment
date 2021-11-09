package Week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Priyanga");
		driver.findElement(By.id("lastNameField")).sendKeys("Lakkaiyan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Priya");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Lakk");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createContactForm_description")).sendKeys("All is well");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("priya@gmail.com");
		WebElement State = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state =new Select(State);
		state.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement description = driver.findElement(By.id("updateContactForm_description"));
		description.clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Should practice well");
		driver.findElement(By.xpath("//td[@colspan='4']/input")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		

	}

}
