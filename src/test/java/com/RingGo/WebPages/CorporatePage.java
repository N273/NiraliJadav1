package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class CorporatePage extends driverManager {
    public void clickCorporate(){
        driver.findElement(By.xpath("//body[1]/ul[1]/li[2]/a[1]")).click();
    }
    public void corporateAccount(){
        driver.findElement(By.xpath("//*[@id=\"UserDetails\"]/fieldset[1]/ol/li[1]/div/div/p/a[2]")).click();
    }
}
