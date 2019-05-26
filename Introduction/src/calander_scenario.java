import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calander_scenario {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files (x86)\\\\Google\\\\Chrome\\\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://spicejet.com");
		
		driver.findElement(By.cssSelector("div.maincontainer:nth-child(12) div.home:nth-child(2) div.staticHomeContentFullpage.position-relative:nth-child(17) div.home_flight_search:nth-child(2) div:nth-child(2) div.book div:nth-child(1) div.picker-first2:nth-child(4) > button.ui-datepicker-trigger:nth-child(4)")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
	}
}
