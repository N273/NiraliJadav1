package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class ParkNowPage extends driverManager {
    public void clickParkNowLink(){
        driver.findElement(By.linkText("PARK NOW")).click();
    }
}
