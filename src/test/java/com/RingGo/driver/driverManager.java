package com.RingGo.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class driverManager {
    public static WebDriver driver;

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://myRingGoTest:W4t3Rf4lls@myrgo-preprod.ctt.co.uk/register");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
    }

    public void closeBrowser() {
        driver.quit();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public WebElement waitUntilWebElementClickable(WebElement element) {
        return new WebDriverWait(driver, 20).until(elementToBeClickable(element));

    }
    }
