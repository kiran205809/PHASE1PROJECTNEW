package chromeproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class oneplusProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C://Users//kirananx//Downloads//geckodriver-v0.32.0-win64//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("one plus mobile");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		
		List<WebElement> device=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		
		System.out.println(device.size());
		
		String[] devicelist = new String[device.size()];
		
		
		int i=0;
		for(WebElement ele:device) {
			
			devicelist[i]=ele.getText();
			System.out.println(devicelist[i]);
	
		i++;	
		}
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		for(WebElement p : price) {
			System.out.println(p.getText());
		}
		
		for(String e: devicelist) {
			
			driver.getTitle();
			driver.findElement(By.partialLinkText(e)).click();
			
			if(e.equals(driver.getTitle())) {
				System.out.println("Validation is done");
			}
			else {
				System.out.println("Validation is not done");
			}
		}

	}

}
