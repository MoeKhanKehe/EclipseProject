import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_executor {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web/");

		driver.findElement(By.id("fromPlaceName")).sendKeys("Beng");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.UP);
		
		for(int i = 0; i<=5; i++) {
		//	Alert alert = driver.switchTo().alert();
		//	alert.accept();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			String script = "return document.getElementById(\"fromPlaceName\").value;";
			String text = (String) js.executeScript(script);
			
			if(!text.contains("jlh")){
				driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
				i++;
			}else {System.out.print("did not find any matching text");}

		}
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
		
	}
}
