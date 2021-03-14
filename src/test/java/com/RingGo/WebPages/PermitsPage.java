package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class PermitsPage extends driverManager {
    public void PermitsLink(){
        driver.findElement(By.linkText("Permits")).click();
    }

    public void clickPermits(){
        driver.findElement(By.xpath("//*[@id=\"UserDetails\"]/fieldset[1]/ol/li[1]/div/div/p/a[1]")).click();
    }
}
