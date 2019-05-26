import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nested_frame_assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Nested Frames")).click();;
		driver.switchTo().frame(driver.findElement(By.cssSelector("[name='frame-top']")));
		driver.switchTo().frame("frame-middle");

		driver.findElement(By.id("content")).getText();
		driver.close();
	}

}
