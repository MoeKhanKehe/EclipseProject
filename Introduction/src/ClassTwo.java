import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTwo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files (x86)\\\\Google\\\\Chrome\\\\Application\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
//		driver.findElement(By.id("username")).sendKeys("hello");
//		driver.findElement(By.xpath(".//*[@id='Login']")).click();
//		System.out.println(driver.findElement(By.id("error")).getText());
		
		driver.findElement(By.xpath(".//*[@id='initialView']/footer/ul/li[2]/a")).click();
	}

}
