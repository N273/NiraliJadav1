package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LanguagePage extends driverManager {

    public void language(){
          driver.findElement(By.className("goog-te-combo")).getText();
        driver.findElement(By.className("goog-te-combo")).click();
          WebElement staticDropDown = driver.findElement(By.className("goog-te-combo"));
        Select  dropDown = new Select(staticDropDown);
           dropDown.selectByVisibleText("Gujarati");
           //System.out.println(dropDown.getFirstSelectedOption().getText());


    }
}
