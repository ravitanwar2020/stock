import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		System.out.println("site open");
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		System.out.println("login page open");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.id("ap_email")).sendKeys("contact.ravitanwar@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	
	    driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
	    driver.findElement(By.id("ap_password")).sendKeys("kuhu@2020");
        driver.findElement(By.id("signInSubmit")).click();
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tshirts for men");
        driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
        
            //driver.get("http://www.facebook.com");
      		//driver.manage().window().maximize();
      		//driver.findElement(By.id("email")).sendKeys("contact.ravitanwar@gmail.com");
      		//driver.findElement(By.id("pass")).sendKeys("kuhu@2020");
      	
      		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      		//driver.findElement(By.id("u_0_b")).click();

		

	}

}
