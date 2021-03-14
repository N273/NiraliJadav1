package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class IphoneLinkPage extends driverManager {
    public void iphoneIcon(){
        driver.findElement(By.className("footer-img")).click();
    }
}
