import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;





public class Firstseleniumtest {


		
	public static void main(String[] args) throws InterruptedException
	{
		
		//WebDriver driver;
		
	//	public void launchBrowser()	{
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("working 1");
		
		//facebook login
		
		//driver.get("http://www.facebook.com");
		//driver.manage().window().maximize();
		//driver.findElement(By.id("email")).sendKeys("contact.ravitanwar@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("kuhu@2020");
		//driver.findElement(By.id("u_0_b")).click();

		
	
		//pos cloud login 6969
		
		//driver.get("http://139.162.59.120:6969/login");
		//driver.findElement(By.name("username")).sendKeys("iliyas_sandeep");
		//driver.findElement(By.name("password")).sendKeys("sandeep");
		//driver.findElement()
		
		//driver.quit();	
		//obj.launchBrowser();
		
		// POS Live login
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://entpstock.posist.net/");
		
		driver.manage().window().maximize();
	    
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("poutlet");
		
		driver.findElement(By.name("password")).sendKeys("poutlet");
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("//strong[@title='Close the keyboard']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@data-bb-handler='cancel']")).click();
		System.out.println("working login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	      System.out.println("check now 2");
	     
	    Thread.sleep(6000);
	     //driver.findElement(By.xpath("//li[@class='dropdown']/a[1]/span")).click();
	       driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']")).click();
	     
	     System.out.println("check now 3");
	     
	     
	    Thread.sleep(2000);
	    // driver.findElement(By.xpath("//li[@class='ng-scope']/a/i[@class='fa fa-cubes']")).click();
	     driver.findElement(By.xpath("//a[@ng-href='/eStock']")).click();
	     System.out.println("enter into the stock");
	   //  Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[@ui-sref='.entries']")).click();
	    
	     System.out.println("clicked on stock enrty");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[@ng-click='performStockEntry()']")).click();
	     System.out.println("select store");
	    Thread.sleep(2000);
	     //Select sel1= new Select(driver.findElement(By.xpath("//[@class='form-control ng-valid ng-valid-required ng-touched ng-dirty']")));
	    // driver.findElement(By.xpath("//select[@class='form-control ng-valid ng-valid-required ng-touched ng-dirty']")).click();
	    Select sel1= new Select(driver.findElement(By.name("store")));
	     sel1.selectByVisibleText("RTveg Store");
	     //driver.findElement(By.name("store")).click();
	     //driver.findElement(By.label("RTveg Store")).click();
		//Thread.sleep(2000);
		 Select sel2= new Select(driver.findElement(By.name("vendor")));
		 sel2.selectByVisibleText("Tanwar Vegetables");
		 System.out.println("vendor selected");
		 driver.findElement(By.id("1")).click();
	//	 Thread.sleep(2000);
		 driver.findElement(By.name("quantity")).sendKeys("10");
		 driver.findElement(By.xpath("//a[@class='btn btn-primary ng-binding ng-scope']")).click();
		System.out.println("stock entry done");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal-footer ng-scope']/a[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal-footer ng-scope']/a[1]")).click();
		
		System.out.println("stock over");
		
		
		//driver.close();
		
		
		
		
		
	}

}
