package Week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://acme-test.uipath.com/login");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//label[text()='Email:']/following::input[@name='email']")).sendKeys("kumar.testleaf@gmail.com");
	
		driver.findElement(By.xpath("//label[text()='Password:']/following::input[@name='password']")).sendKeys("leaf@12");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Log Out")).click();
		
		driver.close();
		
	}
	
	
	

}
