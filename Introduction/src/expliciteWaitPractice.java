import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expliciteWaitPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://itgeared.com/demo/1506-ajax-loading.html");
		
	  
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/a[2]")).click();
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='results']")));
				
		
		if(driver.findElement(By.cssSelector("div[id='results']")).isDisplayed()) {
			System.out.print(true);
			driver.close();

		}
		
	}

}
