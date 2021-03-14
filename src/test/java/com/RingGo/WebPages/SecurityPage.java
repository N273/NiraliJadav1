package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class SecurityPage extends driverManager {

    public void clickSecurityLink(){
        driver.findElement(By.linkText("Security")).click();
    }
}
