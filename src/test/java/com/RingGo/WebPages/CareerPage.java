package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class CareerPage extends driverManager {
    public void clickCareer(){
        driver.findElement(By.linkText("Careers")).click();
    }
}
