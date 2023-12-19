package test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello World");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//driver.findElement(By.id("APjFqb")).sendKeys("abcd");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("what is this");
		
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
//		List<WebElement> listoftx = driver.findElements(By.xpath("//textarea"));
//		
//		System.out.println(listoftx.size());
//		
//		WebElement textbox = driver.findElement(By.id("APjFqb"));
//		
//		textbox.sendKeys("Automation step by step");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
	}
}
