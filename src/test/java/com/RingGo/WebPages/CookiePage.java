package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class CookiePage extends driverManager {
    public void readCookie(){
        driver.findElement(By.linkText("Read our cookie policy")).getText();
    }
    public void clickReadCookie(){
        driver.findElement(By.linkText("Read our cookie policy")).click();
    }
    public void acceptCookie(){
        driver.findElement(By.id("cookie-dismiss")).click();
    }

    public void clickCookieLink(){
        driver.findElement(By.linkText("Cookies")).click();
    }

}
