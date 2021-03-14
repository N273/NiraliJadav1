package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;

public class TermsConditionPage extends driverManager {
    public void clickTermsCondition(){
        driver.findElement(By.linkText("Terms & Conditions")).click();
    }
}
