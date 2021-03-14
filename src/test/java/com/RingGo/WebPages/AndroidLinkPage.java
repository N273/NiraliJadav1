package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class AndroidLinkPage extends driverManager {
    public void clickAndroidIcon(){
        driver.findElement(By.xpath("//*[@id=\"find-us-links\"]/ul/li[2]/a/img")).click();
    }
}
