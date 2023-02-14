import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class register {

	public static void main(String[] args) throws Exception {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://console.uat.asians.group/#/domain/list");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("automation@gmail.com");
		String pass ="abcd@1234";
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pass);
		WebElement confirm_password = driver.findElement(By.id("password-confirm"));
		confirm_password.sendKeys(pass);
		WebElement Register = driver.findElement(By.xpath("//input[@value='Register']"));
		Register.click();
		String user_homepage_url = "https://console.uat.asians.group/#/domain/list";
		if(user_homepage_url.compareTo(driver.getCurrentUrl())==0) {
			System.out.println("successfullly  Register");
		}else {
			System.out.println("Registration failed");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
