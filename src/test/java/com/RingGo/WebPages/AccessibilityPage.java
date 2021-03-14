package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class AccessibilityPage extends driverManager {
    public void clickAccessLink(){
        driver.findElement(By.linkText("Accessibility")).click();
    }
}
