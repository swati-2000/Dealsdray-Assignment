package CStechinfoSolutions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.google.common.io.Files;

public class UiTesting {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.out.println("Enter the browser name :");
		Scanner sc=new Scanner(System.in);
		String browser=sc.nextLine();
		
		//click on the link number1 and take Screenshot
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			Thread.sleep(100);
			driver.get("https://www.getcalley.com/page-sitemap.xml");
			Thread.sleep(100);
			driver.manage().window().maximize();
			Thread.sleep(100);
			driver.findElement(By.xpath("//a[text()='https://www.getcalley.com/blog/']")).click();
			Thread.sleep(100);
			
			
			File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Thread.sleep(100);
			Files.copy(f1, new File("C:\\Users\\swati\\OneDrive\\Pictures\\Screenshots\\ss1.png"));
			Thread.sleep(100);
			//click on the link number2 and takescreenshot
			
			driver.navigate().back();
			Thread.sleep(100);
			driver.findElement(By.xpath("//a[text()='https://www.getcalley.com/']")).click();
			Thread.sleep(100);
			
			File f2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Thread.sleep(100);
			Files.copy(f2, new File("C:\\Users\\swati\\OneDrive\\Pictures\\Screenshots\\ss2.png"));
			Thread.sleep(100);
			
			//click on the link number3 and takescreenshot
			
			driver.navigate().back();
			Thread.sleep(100);
			driver.findElement(By.xpath("//a[text()='https://www.getcalley.com/free-trial-calley-teams-plan/']")).click();
			Thread.sleep(100);
			
			File f3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Thread.sleep(100);
			Files.copy(f3, new File("C:\\Users\\swati\\OneDrive\\Pictures\\Screenshots\\ss3.png"));
			Thread.sleep(100);
			
			//click on the link number4 and takescreenshot
			
			driver.navigate().back();
			Thread.sleep(100);
			driver.findElement(By.xpath("//a[text()='https://www.getcalley.com/free-trial-calley-pro/']")).click();
			Thread.sleep(100);
			
			File f4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Thread.sleep(100);
			Files.copy(f4, new File("C:\\Users\\swati\\OneDrive\\Pictures\\Screenshots\\ss4.png"));
			Thread.sleep(100);
			
			//click on the link number5 and takescreenshot
			
			driver.navigate().back();
			Thread.sleep(100);
			driver.findElement(By.xpath("//a[text()='https://www.getcalley.com/why-automatic-call-dialer-software/']")).click();
			Thread.sleep(100);
			
			File f5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Thread.sleep(100);
			Files.copy(f5, new File("C:\\Users\\swati\\OneDrive\\Pictures\\Screenshots\\ss5.png"));
			Thread.sleep(100);
			
			driver.close();				
		}		
		//Using Firefox Browser
		else if(browser.equals("firefox"))
			{
				driver=new FirefoxDriver();
				Thread.sleep(100);
				driver.get("https://www.getcalley.com/page-sitemap.xml");
				Thread.sleep(100);
				driver.manage().window().maximize();
				Thread.sleep(100);
				driver.findElement(By.xpath("//a[text()='https://www.getcalley.com/blog/']")).click();
				Thread.sleep(100);
				
				File f6=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Thread.sleep(100);
				Files.copy(f6, new File("C:\\Users\\swati\\OneDrive\\Pictures\\Screenshots\\ss1.png"));
				Thread.sleep(100);
				//click on the link number2 and takescreenshot
				
				driver.navigate().back();
				Thread.sleep(100);
				driver.findElement(By.xpath("//a[text()='https://www.getcalley.com/']")).click();
				Thread.sleep(100);
				
				File f7=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Thread.sleep(100);
				Files.copy(f7, new File("C:\\Users\\swati\\OneDrive\\Pictures\\Screenshots\\ss2.png"));
				Thread.sleep(100);
				
				//click on the link number3 and takescreenshot
				
				driver.navigate().back();
				Thread.sleep(100);
				driver.findElement(By.xpath("//a[text()='https://www.getcalley.com/free-trial-calley-teams-plan/']")).click();
				Thread.sleep(100);
				
				File f8=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Thread.sleep(100);
				Files.copy(f8, new File("C:\\Users\\swati\\OneDrive\\Pictures\\Screenshots\\ss3.png"));
				Thread.sleep(100);
				
				//click on the link number4 and takescreenshot
				
				driver.navigate().back();
				Thread.sleep(100);
				driver.findElement(By.xpath("//a[text()='https://www.getcalley.com/free-trial-calley-pro/']")).click();
				Thread.sleep(100);
				
				File f9=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Thread.sleep(100);
				Files.copy(f9, new File("C:\\Users\\swati\\OneDrive\\Pictures\\Screenshots\\ss4.png"));
				Thread.sleep(100);
				
				//click on the link number5 and takescreenshot
				
				driver.navigate().back();
				Thread.sleep(100);
				driver.findElement(By.xpath("//a[text()='https://www.getcalley.com/why-automatic-call-dialer-software/']")).click();
				Thread.sleep(100);
				
				File f10=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Thread.sleep(100);
				Files.copy(f10, new File("C:\\Users\\swati\\OneDrive\\Pictures\\Screenshots\\ss5.png"));
				Thread.sleep(100);
				
				driver.close();	
				sc.close();
		}
	}	
	}