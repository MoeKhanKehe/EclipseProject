import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files (x86)\\\\Google\\\\Chrome\\\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?passive=true&hl=en&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Fhl%3Den%26next%3D%252Fwatch%253Fv%253DJDQyj7tMUD0%26action_handle_signin%3Dtrue%26app%3Ddesktop&uilel=3&service=youtube&flowName=GlifWebSignIn&flowEntry=ServiceLogin\r\n");
		driver.manage().window().maximize();
		driver.get("https://www.ytmonster.net/exchange/likes");
		driver.manage().window().maximize();

		
		// find the count of all the links on the page
		//System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		//limit the scope of the driver to footer
		driver.findElement(By.id("inputUsername")).sendKeys("Plamen1337");
		driver.findElement(By.id("inputPassword")).sendKeys("N1n2n3n4");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.className("btn")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.className("btn")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin/v2/identifier?passive=true&hl=en&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Fhl%3Den%26next%3D%252Fwatch%253Fv%253DJDQyj7tMUD0%26action_handle_signin%3Dtrue%26app%3Ddesktop&uilel=3&service=youtube&flowName=GlifWebSignIn&flowEntry=ServiceLogin\r\n");
		
		
//		https://accounts.google.com/signin/v2/identifier?passive=true&hl=en&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Fhl%3Den%26next%3D%252Fwatch%253Fv%253DJDQyj7tMUD0%26action_handle_signin%3Dtrue%26app%3Ddesktop&uilel=3&service=youtube&flowName=GlifWebSignIn&flowEntry=ServiceLogin
//		int countOfLinks = footercolumn.findElements(By.tagName("a")).size();
//		for(int i = 1; i < countOfLinks; i++)
//		{
//			String clickonlinks = Keys.chord(Keys.CONTROL,Keys.ENTER);
//			driver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinks);
//			Thread.sleep(5000L);
//		}
//		
//		Set<String>ids = driver.getWindowHandles();
//		Iterator<String> it = ids.iterator();
//		
//		while(it.hasNext())
//		{
//			driver.switchTo().window(it.next());
//			System.out.println(driver.getTitle());
//		}
	}

}
