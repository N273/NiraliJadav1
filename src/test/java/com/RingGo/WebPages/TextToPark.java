package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class TextToPark extends driverManager {
    public void clickTextToPark(){
        driver.findElement(By.cssSelector("#footer-main-links > li:nth-child(1) > a")).click();
    }

}
