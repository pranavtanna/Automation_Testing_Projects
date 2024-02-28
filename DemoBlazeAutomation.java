package testNG_Scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoBlazeAutomation {

	WebDriver driver;

	@BeforeTest //Code of Browser setup and to open it.
	public void method1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Pranav Tanna\\Eclipse workspace\\Automation\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html#");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		System.out.println("Browser Opened Successfully");
	}

	@Test (priority=0)
	public void Signup() throws InterruptedException {

		//To click on Sign-up
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(1000);
		//To Enter Username
		driver.findElement(By.id("sign-username")).sendKeys("tendulkar1");
		Thread.sleep(1000);
		//To Enter Password
		driver.findElement(By.id("sign-password")).sendKeys("tendyaa123");
		Thread.sleep(1000);
		//To click on Sign-Up
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(1000);

		Alert alert1 = driver.switchTo().alert();
		//Display the alert message
		String alertMessage1 = driver.switchTo().alert().getText();
		System.out.println(alertMessage1);
		//To click on OK
		alert1.accept();
		Thread.sleep(1000);					

	}

	@Test (priority=1)
	public void Login() throws InterruptedException {
		//To click on Login
		driver.findElement(By.id("login2")).click();
		Thread.sleep(1000);
		//To Enter Username
		driver.findElement(By.id("loginusername")).sendKeys("tendulkar1");
		Thread.sleep(1000);
		//To Enter Password
		driver.findElement(By.id("loginpassword")).sendKeys("tendyaa123");
		Thread.sleep(1000);
		//To click on Login
		driver.findElement(By.xpath("//button[@onclick=\"logIn()\"]")).click();
		Thread.sleep(2000);
	}

	@Test (priority=2)
	public void AddToCartProducts() throws InterruptedException {

		//To click on Samsung galaxy s6 product
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img")).click();
		Thread.sleep(2000);
		//To click on Add to Cart
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(2000);

		Alert alert2 = driver.switchTo().alert();
		//Display the alert message
		String alertMessage2 = driver.switchTo().alert().getText();
		System.out.println(alertMessage2);
		//To click on OK
		alert2.accept();
		Thread.sleep(1000);	

		//To click on Home Page
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
		Thread.sleep(1000);

		//To click on Nokia lumia 1520 product
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a/img")).click();
		Thread.sleep(2000);
		//To click on Add to Cart
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(2000);

		Alert alert3 = driver.switchTo().alert();
		//Display the alert message
		String alertMessage3 = driver.switchTo().alert().getText();
		System.out.println(alertMessage3);
		//To click on OK
		alert3.accept();
		Thread.sleep(1000);	
	}

	@Test (priority=3)
	public void PlaceOrder() throws InterruptedException {

		//To click on Cart
		driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
		Thread.sleep(1000);

		//To click on Place Order
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		Thread.sleep(1000);
		//To Enter Name
		driver.findElement(By.id("name")).sendKeys("ms");
		Thread.sleep(1000);
		//To Enter Country
		driver.findElement(By.id("country")).sendKeys("India");
		Thread.sleep(1000);
		//To Enter City
		driver.findElement(By.id("city")).sendKeys("Thane");
		Thread.sleep(1000);
		//To Enter Credit Card
		driver.findElement(By.id("card")).sendKeys("9999");
		Thread.sleep(1000);
		//To Enter Month
		driver.findElement(By.id("month")).sendKeys("sept");
		Thread.sleep(1000);
		//To Enter Year
		driver.findElement(By.id("year")).sendKeys("2023");
		Thread.sleep(1000);
		//To click on purchase
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(1000);
		//To click on OK of Receipt Page
		driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
		Thread.sleep(1000);
	}

	@Test (priority=4)
	public void Logout() throws InterruptedException {
		//To click on logout
		driver.findElement(By.xpath("//*[@id=\"logout2\"]")).click();
		Thread.sleep(1000);
	}


	@AfterTest //Code for Closing the browser.
	public void method3() {
		driver.quit();
		System.out.println("Browser Closed Successfully");
	}
}

