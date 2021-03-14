package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class BreadCrumbsMenuPage extends driverManager {
    public void homeLink(){
        driver.findElement(By.linkText("Home")).getText();
    }
}
