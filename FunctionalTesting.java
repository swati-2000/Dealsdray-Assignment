package CStechinfoSolutions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTesting {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.dealsdray.com/");
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='chevron_right']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		driver.findElement(By.xpath("//div/div/div[2]/div/div/div[2]/div[2]/button")).click();
		File f=new File("./src/CStechinfoSolutions/demo-data.xlsx");
		String input = f.getAbsolutePath();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(input);
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/div[3]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Validate Data']")).click();
		Thread.sleep(1000);
		Alert a=driver.switchTo().alert();
		a.accept();
	}

}
