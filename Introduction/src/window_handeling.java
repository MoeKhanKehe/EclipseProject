import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class window_handeling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com");

		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.cssSelector(".example a")).click();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();
		String parent_window = it.next();
		String child_window = it.next();

		driver.switchTo().window(child_window);
		String child_window_text = driver.findElement(By.cssSelector(".example h3")).getText();

		System.out.println(child_window_text);

		driver.switchTo().window(parent_window);
		String parent_window_text = driver.findElement(By.cssSelector(".example h3")).getText();
		System.out.println(parent_window_text);

	}

}
