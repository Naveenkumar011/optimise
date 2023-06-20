package introselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class optimise<Wait, FluentWait, WebDriverWait> {

	public  void statBrowser() {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
	}
	
	public void stopBrowser(){
	
		
		
	}
	@Test(priority = 1)
	public void tcFL0106() throws InterruptedException{
		//combining all these test cases as single scenario (tcFL01, tcFL02, tcFL03, tcFL04, tcFL05, tcFL06)
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.optimisemedia.com/contact");
		Thread.sleep(3000);
		driver.findElement(By.className("form-control ng-pristine ng-invalid ng-touched")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@formcontrolname = 'email']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@formcontrolname='phone']")).sendKeys("09****");
		driver.findElement(By.xpath("//div/input[@formcontrolname='source']")).sendKeys("xyz");
		driver.findElement(By.xpath("//div/textarea[@formcontrolname='message']")).sendKeys("xyz");
		driver.findElement(By.className("btn outline-btn blue submit")).click();
	}
	
	@Test(priority = 2)
	public void tcFL07() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.optimisemedia.com/contact");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a/span[@class='blue']"));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("locator")));
		
	}
	
	@Test(priority = 3)
	public void tcFL08() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.optimisemedia.com/partners");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='base-label']")));
	}
	
	@Test(priority = 4)
	public void tcFL09() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.optimisemedia.com/advertisers");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[@class = 'navbar navbar-expand-lg mb-0']")));
	}
	
	@Test(priority = 5)
	public void tcFL10() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.optimisemedia.com/platform");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[@class = 'navbar navbar-expand-lg mb-0']")));
	}
	
	@Test(priority = 6)
	public void tcFL11() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.optimisemedia.com/about");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("md-label white")));
	}
	
	@Test(priority = 7)
	public void tcFL12() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.optimisemedia.com/resources");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("section-desc")));
	}
	
	@Test(priority = 8)
	public void tcFL13() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://dashboard.optimisemedia.com/?utm_source=WebsiteLogin&utm_medium=website");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("app.containers.LoginForm.emailInput")));
	}
	
	@Test(priority = 9)
	public void tcFL14() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.optimisemedia.com/signup");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn outline-btn")));
	}
	
	@Test(priority = 10)
	public void tcFL15() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.optimisemedia.com/in");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("col-lg-4 left-copy")));
	}
	
	@Test(priority = 11)
	public void tcFL16() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.optimisemedia.com/in");
		Thread.sleep(5000);
		driver.get("https://www.optimisemedia.com/optimise-linkables-affiliate-links");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("base-label content-with-newlines")));
	}
	
	@Test(priority = 12)
	public void tcFL17() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.optimisemedia.com/platform");
		Thread.sleep(5000);
		driver.get("https://www.optimisemedia.com/products/partner-platform");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("md-label bold")));
	}
	
	@Test(priority = 13)
	public void tcFL18() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.optimisemedia.com/platform");
		Thread.sleep(5000);
		driver.get("https://www.optimisemedia.com/insight");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("body")));
	}
	
	@Test(priority = 14)
	public void tcFL19() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.optimisemedia.com/about");
		Thread.sleep(5000);
		driver.get("https://www.optimisemedia.com/products");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("col-lg-5 offset-lg-1 col-md-12")));
	}
	
	@Test(priority = 15)
	public void tcFL20() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.optimisemedia.com/resources");
		Thread.sleep(5000);
		driver.get("https://knowledge.optimisemedia.com/docs/publishersgettingstarted/");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("col docItemCol_VOVn")));
	}
}
