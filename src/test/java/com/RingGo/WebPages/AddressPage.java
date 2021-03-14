package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class AddressPage extends driverManager {
    public void readAddress(){
        driver.findElement(By.xpath("//*[@id=\"copyright\"]/p[1]")).getText();
    }
}
