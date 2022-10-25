package chromeproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement txtfield = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		WebElement searchbut = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		txtfield.sendKeys("lenovo mobile");
		searchbut.click();
		
		
	      List<WebElement> device = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	    
	      System.out.println(device.size());
	      
	      List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		     
	      String [] devicename = new String[device.size()];
	      String [] pricelist = new String[price.size()];
	      
	      
	      
	      
	      int i=0;
	      for(WebElement e:device){ 
	      devicename[i]=e.getText();
	      System.out.println(devicename[i]);
	      
	      i++;
	      }   
	      
	      for(WebElement p:price) {
	    	  
	    	  System.out.println(p.getText());
	      }
	      
	      
	   
	     for(String e: devicename) {
	    	 
	    	 driver.findElement(By.linkText(e)).click();
	    	 String title= driver.getTitle();
	    	 
	    	 System.out.println("Title of respective device "+title);
	    	 
	    	 if(title.equals(driver.getTitle())) {
	    		 System.out.println(driver.getTitle());
	    		 System.out.println("Validation done");
	    		 
	    	 }
	    	 else{
	    		 System.out.println("Validation not done");
	    	 }
	     }
         
			
	     //List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	   //  for(WebElement p:price) {
	    	 
	    	// System.out.println(p.getText()); /
	     }
	     
		}
	
	    
		
		
		
		
		

	



