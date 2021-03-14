package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class PrivacyNoticePage extends driverManager {
    public void clickPrivacy(){
        driver.findElement(By.linkText("Privacy Notice")).click();
    }
}
