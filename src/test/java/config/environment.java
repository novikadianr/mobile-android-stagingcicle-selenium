package config;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class environment {
    public static AppiumDriver driver;
    public static DesiredCapabilities capabilities;

    public static int duration = 5;

    public static WebDriverWait wait;
}
