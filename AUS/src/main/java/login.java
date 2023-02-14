import java.util.concurrent.TimeUnit;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class login {
	public static void main(String[] args) throws Exception {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://console.uat.asians.group/#/domain/list");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys(" saurabhrupekar1998@gmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("abcd@1234");
		WebElement login = driver.findElement(By.id("kc-login"));
		login.click();
		String user_homepage_url = "https://console.uat.asians.group/#/domain/list";
		if(user_homepage_url.compareTo(driver.getCurrentUrl())==0) {
			System.out.println("successfullly  logIn");
			}else {
			System.out.println("LogIn failed");
		}
		Thread.sleep(2000);
		driver.close();

	}
}