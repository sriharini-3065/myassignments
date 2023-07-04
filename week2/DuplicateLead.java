package seleniumassignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sri Harini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Yuganand");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sri Harini Selvam");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ABCD");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("abc");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ABCD@gmail.com");
		WebElement ss=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec=new Select(ss);
		sec.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("the title of the page is :"+driver.getTitle());
		driver.findElement(By.className("subMenuButton")).click();
		WebElement comp=driver.findElement(By.id("createLeadForm_companyName"));
	     comp.clear();
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
	     WebElement firstn=driver.findElement(By.id("createLeadForm_firstName"));
	     firstn.clear();
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SriHarini");
	     driver.findElement(By.className("smallSubmit")).click();
		System.out.println("the title of the page is :"+driver.getTitle());
		
			

		
		
		

	}

}
