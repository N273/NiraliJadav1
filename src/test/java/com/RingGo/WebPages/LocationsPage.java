package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class LocationsPage extends driverManager {
    public void LocationLink(){
        driver.findElement(By.linkText("Locations")).click();
    }
}
