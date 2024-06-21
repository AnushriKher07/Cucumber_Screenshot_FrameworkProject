package Utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

import io.cucumber.java.Scenario;

public class SeleniumUtil {
private static WebDriver driver;
private Scenario scenario;


	    public static WebDriver getDriver() {
	        if (driver == null) {
	        	System.setProperty("webdriver.gecko.driver", "C:\\Automation\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	        	   driver = new FirefoxDriver();
	        }
	        return driver;
	    }

	    public static byte[] takeScreenShotAsBytes() throws IOException {
    return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
}

public static void tearDown() {
    if (driver != null) {
        driver.quit();
        driver = null;
    }
}

		/*
		 * public static void takeScreenShot() throws IOException { File scrFile =
		 * ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 * Files.copy(scrFile, new File("target/screenshot.png")); }
		 * 
		 * public static void embedScreenShotInReport() throws IOException { final
		 * byte[] screenshot = ((TakesScreenshot)
		 * driver).getScreenshotAs(OutputType.BYTES); Scenario scenario = null; // Get
		 * current scenario if(scenario != null) { scenario.attach(screenshot,
		 * "image/png", "screenshot"); }
		 * 
		 * }
		 */
}
