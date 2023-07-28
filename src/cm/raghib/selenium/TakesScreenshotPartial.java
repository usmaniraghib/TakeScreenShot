package cm.raghib.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshotPartial {

	public static String location1 = "http://google.com";
	public static String location2 = "https://rahulshettyacademy.com/angularpractice/";

	public static String serachBoxXPath = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]";
	public static String nameBoxXPath = "//body/app-root[1]/form-comp[1]/div[1]/form[1]/div[1]/input[1]";

	public static void main(String[] args) throws IOException, InterruptedException {
		// Set the driver path
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		/*
		 * driver.get(location1); WebElement searchBox =
		 * driver.findElement(By.xpath(serachBoxXPath));
		 * searchBox.sendKeys("What is selenium webdriver");
		 * 
		 * // CASTING DRIVER OBJECT TO TAKE SCREEN SHOTS. File src1 =
		 * searchBox.getScreenshotAs(OutputType.FILE); FileUtils.copyFile(src1, new
		 * File(System.getProperty("user.dir") + "\\searchBoxPartialScreenshot.png"));
		 * Thread.sleep(5000); driver.close();
		 */

		driver.get(location2);
		WebElement nameBox = driver.findElement(By.xpath(nameBoxXPath));
		nameBox.sendKeys("What is selenium webdriver");
		// CASTING DRIVER OBJECT TO TAKE SCREEN SHOTS.
		File src2 = nameBox.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File(System.getProperty("user.dir") + "\\nameBoxPartialScreenshot.png"));
		Thread.sleep(5000);
		driver.quit();

	}

}
