package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class DownloadPage extends driverManager {

    public void DownloadLink(){
        driver.findElement(By.linkText("Download")).click();
    }
}
