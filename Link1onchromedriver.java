package CStechinfoSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link1onchromedriver {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.getcalley.com/blog/");
	}

}
