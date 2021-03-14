package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class FaceBookPage extends driverManager {
    public void clickFacebookImage(){
      driver.findElement(By.xpath("//*[@id=\"find-us-links\"]/ul/li[5]/a/img")).click();
    }
}
