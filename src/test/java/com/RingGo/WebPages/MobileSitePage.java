package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class MobileSitePage extends driverManager {
    public void clickMobileLink(){
        driver.findElement(By.linkText("Mobile Site")).click();
    }
}
