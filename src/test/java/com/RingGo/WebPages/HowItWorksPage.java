package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class HowItWorksPage extends driverManager {
    public void HowItWorks(){
        driver.findElement(By.linkText("How it works")).click();
    }
}
