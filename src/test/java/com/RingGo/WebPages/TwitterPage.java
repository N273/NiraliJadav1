package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class TwitterPage extends driverManager {
    public void clickTwitter(){
        driver.findElement(By.xpath("//*[@id=\"find-us-links\"]/ul/li[4]/a/img")).click();
    }
}
