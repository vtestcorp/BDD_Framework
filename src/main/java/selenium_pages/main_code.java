package selenium_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.base;

public class main_code extends base {
	 
		public void launchBrowser() {
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		public void openGoogleURL() throws InterruptedException {
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			Thread.sleep(10000);
		}
			
		public void checkSearchBoxIsDisplayed() {
			if(driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).isDisplayed()) {
				System.out.println("Search text box is displayed");
			} else {
				System.out.println("Search text box is NOT displayed");
			}
		}
		
		public void enterkeyword() {
			driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys("Bro"); 
			
			
		}
		
		public void searchkeyword() {
			//driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys("Bro "); 
			List<WebElement> l=driver.findElements(By.xpath("//div[@class='product']"));
			if(l.size()!=0) {
				System.out.println("Matching products loaded");
			}
			{
				System.out.println("Matching products not loaded");
			}
			
			
			
			
		}
		public void add_tocart() {
			driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
			
	}
		public void check_tocart() {
			driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
			WebElement cart_value=driver.findElement(By.xpath("//div[@class='cart-preview active']//div//div//p[@class='product-name'][contains(text(),'Brocolli - 1 Kg')]"));
			if(cart_value.isDisplayed())
		{
			System.out.println("Added product present incart");
		} else {
			System.out.println("Added product not present incart");
		}
	}
			
			
//		public void checkGoogleSearchButtonIsDisplayed() {
//			if(driver.findElement(By.xpath("//div//div//div[@type=\"submit\"]")).isEnabled())
//			{
//				System.out.println("Search button is displayed");
//			} else {
//				System.out.println("earch button is NOT displayed");
//			}
//		}
		
//		public void checkImFeelingLuckyButtonIsDisplayed() {
//			if(driver.findElement(By.xpath("//input[@aria-label=\"I'm Feeling Lucky\"]")).isEnabled()) {
//				System.out.println("I'm Feeling Lucky button is displayed");
//			} else {
//				System.out.println("I'm Feeling Lucky button is NOT displayed");
//			}
		//}
	}


