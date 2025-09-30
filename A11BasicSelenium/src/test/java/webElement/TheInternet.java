package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TheInternet {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		//click on remove
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		//click on add
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		
		//click on Enable
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		
		//Give the input to the text field
		WebElement input = driver.findElement(By.cssSelector("input[type='text']"));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(input));
		input.sendKeys("Qwerty");
		Thread.sleep(1000);
		driver.quit();
	}

}
