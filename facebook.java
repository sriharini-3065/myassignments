package seleniumassignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sri Harini");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Yuganand");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("7358003936");
		driver.findElement(By.id("password_step_input")).sendKeys("adcd@123");
		WebElement element= driver.findElement(By.id("day"));
		Select ss=new Select(element);
		ss.selectByValue("6");
		WebElement element1= driver.findElement(By.id("month"));
		Select month=new Select(element1);
		month.selectByValue("6");
		WebElement element2= driver.findElement(By.id("year"));
		Select year=new Select(element2);
		year.selectByValue("1995");
		
		driver.findElement(By.xpath("(//input[@class='_8esa'])")).click();
		
		
		
		
		
		
	}

}
