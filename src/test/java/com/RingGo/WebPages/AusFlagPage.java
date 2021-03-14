package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class AusFlagPage extends driverManager {
    public void ausFlagImg(){
        driver.findElement(By.xpath("//*[@id=\"footer-country\"]/p[3]/a/img")).click();
    }
}
