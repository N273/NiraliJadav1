package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class HelpPage extends driverManager {
    public void HelpLink(){
       driver.findElement(By.linkText("Help")).click();
    }
}
