package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class RingGoPage extends driverManager{
    public void RingGoImage() {
        driver.findElement(By.xpath("//img[@class ='logo ringgo-logo']")).click();
    }

    }

