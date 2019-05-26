import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Strings;

public class SwitchWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files (x86)\\\\Google\\\\Chrome\\\\Application\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://accounts.google.com/signup");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='initialView']/footer/ul/li[2]/a")).click();
		System.out.println(driver.getTitle());
		
		
		///switch windows 
//		Set<String>ids = driver.getWindowHandles();
//		Iterator<String> it = ids.iterator();
//		String ParentId = it.next();
//		String ChildId = it.next();
//		driver.switchTo().window(ChildId);
//		
//		System.out.println(driver.getTitle());
//		System.out.println("switching back to parent");
//		driver.switchTo().window(ParentId);
//		System.out.println(driver.getTitle());
		
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it= ids.iterator();
		String pid = it.next();
		String cid = it.next();
		driver.switchTo().window(cid);
		

	}

}
