package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class ResidencyPage extends driverManager {
    public void clickResidency(){
        driver.findElement(By.linkText("Residency")).click();
    }
}
