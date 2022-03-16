package aui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class PORTAL {
	public static String browser = "Firefox";
	public static WebDriver driver ;

	PORTAL(){
		
		
		
		   if (browser.equals("Firefox")) {

				WebDriverManager.firefoxdriver().setup();

				 driver = new FirefoxDriver();

			} else if (browser.equals("Chrome")) {
				WebDriverManager.chromedriver().setup();

				 driver = new ChromeDriver();
			}
	    		driver.get("https://www.saucedemo.com/");
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				driver.findElement(By.id("login-button")).click();
		        Select productsort_container = new Select(driver.findElement(By.className("product_sort_container")));
		        productsort_container.selectByValue("hilo");
/*		        Select inventory_sideBar = new Select(driver.findElement(By.id("inventory_sidebar_link")));

		        inventory_sideBar.selectByIndex(2);
*/

	}
	
	
}
