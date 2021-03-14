package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class PersonalPage extends driverManager {
    public void personalLink(){
        driver.findElement(By.className("active-page")).getText();
    }
    public void clickPersonalLink(){
        driver.findElement(By.className("active-page")).click();
    }
}
