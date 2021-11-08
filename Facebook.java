package Week2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
				
	driver.manage().window().maximize();
   	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
driver.findElement(By.linkText("Create New Account")).click();
driver.findElement(By.name("firstname")).sendKeys("Mithraa");
driver.findElement(By.name("lastname")).sendKeys("Vimal");
driver.findElement(By.name("reg_email__")).sendKeys("123456789");
driver.findElement(By.name("reg_passwd__")).sendKeys("B@134Gtwd");
WebElement Date = driver.findElement(By.name("birthday_day"));
Select day =new Select(Date);
day.selectByValue("10");
WebElement Month = driver.findElement(By.name("birthday_month"));
Select month =new Select(Month);
month.selectByValue("May");
WebElement Year = driver.findElement(By.name("birthday_year"));
Select year =new Select(Year);
year.selectByValue("1999");
driver.findElement(By.xpath("//label[text()='Female']")).click();





	}

}
