import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class assignment_6_checkbox_label {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.findElement(By.cssSelector("input#checkBoxOption2")).click();
		
		String text = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		System.out.println(text);
		
		driver.findElement(By.id("dropdown-class-example")).click();
		driver.findElement(By.xpath("//option[contains(text(),'" + text + "')]")).click();
		
		///enter option into textbox
		driver.findElement(By.cssSelector("#name")).sendKeys(text);
		Thread.sleep(3000);
		
		driver.findElement(By.id("alertbtn")).click();
		
		//switch to alert
		Alert alert = driver.switchTo().alert();
		
		String alert_text = alert.getText();
		System.out.print(alert_text.contains(text));

		alert.accept();
		

	}
}
