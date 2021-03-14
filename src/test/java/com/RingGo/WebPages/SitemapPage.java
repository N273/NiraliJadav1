package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class SitemapPage extends driverManager {
    public void clickSitemap(){
        driver.findElement(By.linkText("Sitemap")).click();
    }
}
