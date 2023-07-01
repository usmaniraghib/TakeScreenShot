package cm.raghib.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshotFull {
	public static void main(String[] args) throws IOException {
		// Set the driver path
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\browser-driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		//CASTING DRIVER OBJECT TO TAKE SCREEN SHOTS.
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\screenshot.png"));
		driver.quit();

	}

}
