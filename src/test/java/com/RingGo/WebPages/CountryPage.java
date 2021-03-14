package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class CountryPage extends driverManager {
    public void readCountry(){
        driver.findElement(By.xpath("//*[@id=\"footer-country\"]/p[1]")).getText();
    }
}
