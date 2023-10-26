package week7.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {
public static void main(String[] args) throws InterruptedException {
	//launch the browser
	ChromeDriver driver= new ChromeDriver();
	
	//load the URL
	driver.get("http://leaftaps.com/opentaps/control/login");
	
	//maximize the browser
	driver.manage().window().maximize();
	
	//enter UserName
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
    
	//enter password
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	
	// click submit
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	
	//click CRM/SFA
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	
	//click leads
	driver.findElement(By.linkText("Leads")).click();
	
	//click merge leads
	driver.findElement(By.linkText("Merge Leads")).click();
	
	//click FromLead icon
	driver.findElement(By.xpath("//span[text()='From Lead']/following::img")).click();
	
	//to get parent window
	String parentwindow = driver.getWindowHandle();
	String title1 = driver.getTitle();
	System.out.println("title1 "+title1);
	
	//to get child window
	Set<String> childwindow = driver.getWindowHandles();
	
	//create empty list and convert set into list
	List<String> openedwindow=new ArrayList<String>(childwindow);
	driver.switchTo().window(openedwindow.get(1));
	Thread.sleep(3000);
	
	//get title
	String title2= driver.getTitle();
	System.out.println("title2 "+title2);
	
	//to click any lead from list
	 driver.findElement(By.xpath("//div[contains(@class,'x-grid3-hd-inner')]/following::a[@class='linktext']")).click();
     driver.switchTo().window(openedwindow.get(0));
     
	//click ToLead icon 
	 driver.findElement(By.xpath("//span[@class='requiredField']/following::img[2]")).click();
	 
     //get window handles
     Set<String> childWindow1 = driver.getWindowHandles();
     
     //create empty list and convert set into list
	 List<String> openedwindow1 = new ArrayList<String>(childWindow1);
	 driver.switchTo().window(openedwindow1.get(1));
	 Thread.sleep(3000);
	 
	 //click any leads in list 
	 driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-hd-inner')]/following::a[@class='linktext'][15])")).click();
	 driver.switchTo().window(openedwindow1.get(0));

	 //click merge button
	 driver.findElement(By.linkText("Merge")).click();

	 //alert
	 driver.switchTo().alert().accept();
}
}
