package introselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class fitnessapp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\Downloads\\chromedriver_win32.exc");
		
		driver.manage().window().maximize();
		//I have my own login to update my foods and personal data's in the myfitnesspal app and i'm entering the details of foods and exercises details by everyday
		driver.get("https://www.myfitnesspal.com/account/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/button[@title='ACCEPT']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("xyz");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("abc");
		Thread.sleep(3000);
		driver.findElement(By.className("MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw")).click();
		getfood(driver);
	}

	public static void getfood(WebDriver driver) throws InterruptedException {
		//entering the food details
		Thread.sleep(3000);
		driver.get("https://www.myfitnesspal.com/food/diary");
		//entering the breakfast details
		driver.get("/food/add_to_diary?meal=0");
		//entering the lunch details
		Thread.sleep(3000);
		driver.get("/food/add_to_diary?meal=1");
		//entering the dinner details
		Thread.sleep(3000);
		driver.get("/food/add_to_diary?meal=2");
		//entering the Snacks details
		Thread.sleep(3000);
		driver.get("/food/add_to_diary?meal=3");
		getexercise(driver);
	}
	
	public static void getexercise(WebDriver driver) throws InterruptedException {
		//entering the exercise details
		Thread.sleep(3000);
		driver.get("/exercise/add_to_diary?type=cardio");
		//have already added the exercise which i'm usually doing by everyday... so i'm using that one
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td/input[@class='checkbox']")).click();
		Thread.sleep(2000);
		//have added the exercises in that 
		driver.findElement(By.xpath("//p/input[@class='button add-favorite-exercises']")).click();
		//navigate back to home
		driver.get("href=\"/\">Home</a>");
		getfriends(driver);
	}
	
	public static void getfriends(WebDriver driver) throws InterruptedException {
		//inviting our friends
		Thread.sleep(2000);
		driver.get("/friends");
		//this is the first time we are inviting our friends
		Thread.sleep(2000);
		driver.findElement(By.className("MuiButton-containedSizeMedium css-vn3pre")).click();
		Thread.sleep(2000);
		driver.findElement(By.id(":r1t:")).sendKeys("first name");
		Thread.sleep(2000);
		driver.findElement(By.id(":r1u:")).sendKeys("last name");
		Thread.sleep(2000);
		driver.findElement(By.id(":r1v:")).sendKeys("email id");
		Thread.sleep(2000);
		driver.findElement(By.className("MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-tb-9 css-1m3jdkk")).click();
		//successfully added a friend
		Thread.sleep(2000);
		//navigate back to home
		driver.get("href=\"/\">Home</a>");
		getgoals(driver);
	}
	
	public static void getgoals(WebDriver driver) throws InterruptedException {
		//viewing the goals
		Thread.sleep(2000);
		driver.get("https://www.myfitnesspal.com/account/my-goals");
		Thread.sleep(2000);
		//editing the daily goals
		driver.get("/account/my-goals/daily-nutrition-goals");
		Thread.sleep(2000);
		//we r going to give what is the calories needed for u
		driver.findElement(By.id(":r4u:")).sendKeys("int");
		Thread.sleep(2000);
		//navigate back to home
		driver.get("href=\"/\">Home</a>");
		getreports(driver);
	}
	
	public static void getreports(WebDriver driver) throws InterruptedException {
		//viewing the reports
		Thread.sleep(2000);
		//exporting the data as report
		driver.get("https://www.myfitnesspal.com/reports");
		Thread.sleep(2000);
		driver.get("chzn-single");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Protein']")).click();
		Thread.sleep(2000);
		driver.get("/en/reports/export");
		Thread.sleep(3000);
		driver.findElement(By.className("MuiButton-containedSizeMedium css-iebqej")).click();
		getapp(driver);
	}
	
	public static void getapp(WebDriver driver) throws InterruptedException {
		//connecting to the other fitness apps
		Thread.sleep(5000);
		driver.get("https://www.myfitnesspal.com/apps");
		Thread.sleep(2000);
		driver.get("http://www.myfitnesspal.com/fitbit/authorize");
		
	}
	
	}
	




	

