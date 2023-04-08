package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Breakoutsession {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("crmsfa");
		WebElement Login = driver.findElement(By.className("decorativeSubmit"));
		Login.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement Companyname = driver.findElement(By.id("createLeadForm_companyName"));
		Companyname.sendKeys("Innovasolutions");
		WebElement Firstname = driver.findElement(By.id("createLeadForm_firstName"));
		Firstname.sendKeys("Karthikeyan");
		WebElement Lastname = driver.findElement(By.id("createLeadForm_lastName"));
		Lastname.sendKeys("R");
		/*
		 * WebElement Createlead = driver.findElement(By.name("submitButton"));
		 * Createlead.click();
		 */

		WebElement Drop = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select DD = new Select(Drop);
		DD.selectByVisibleText("Direct Mail");
		WebElement Fname = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		Fname.sendKeys("karthi");
		WebElement Departmentname = driver.findElement(By.id("createLeadForm_departmentName"));
		Departmentname.sendKeys("IT Department");
		WebElement Description = driver.findElement(By.id("createLeadForm_description"));
		Description.sendKeys("A lead, also called a team lead or team leader");
		WebElement Email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		Email.sendKeys("karthikeyanravi2017@gmail.com");
		WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select Dd = new Select(State);
		Dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
