import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_link_count_and_window_name {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
//		driver.manage().window().maximize();

		WebElement coloumndriver = driver.findElement(By.cssSelector("[id='gf-BIG'] td:nth-child(1) ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());

		for (int i = 1; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {

			String click_and_enter = Keys.chord(Keys.CONTROL, Keys.ENTER);
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(click_and_enter);
		}
//			Thread.sleep(5000L);
//
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> it = tabs.iterator();

		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

	}
}
