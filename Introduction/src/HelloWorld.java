import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) {
		//setting the property of the of driver to execute driver
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files (x86)\\\\Google\\\\Chrome\\\\Application\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//Create new object of chrome driver
		driver.get("http://facebook.com");
		System.out.print(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.linkText("Forgot account?")).click();
		
	}

}
