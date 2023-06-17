package CStechinfoSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Excercise1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		DesiredCapabilities cp=new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, op);
		op.merge(cp);
		
		WebDriver driver=new ChromeDriver(op);
		Thread.sleep(2000);
		driver.get("https://demo.dealsdray.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
