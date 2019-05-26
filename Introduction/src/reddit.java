import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reddit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files (x86)\\\\Google\\\\Chrome\\\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("my login username");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Bye");
		driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();

	}

}
