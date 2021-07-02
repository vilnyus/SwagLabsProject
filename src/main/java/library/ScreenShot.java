package library;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class ScreenShot {
    public static void captureScreenShot(WebDriver driver, String sScreenShotName){
        try{
            File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screenshot.toPath(), Path.of("D:\\Selenium_Projects\\SwagLabsProject\\src\\test\\resources\\screenshotes"));
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
