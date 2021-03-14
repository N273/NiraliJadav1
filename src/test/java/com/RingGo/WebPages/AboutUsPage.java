package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class AboutUsPage extends driverManager {

    public void AboutUsLink(){
        driver.findElement(By.linkText("About us")).click();
    }
}
