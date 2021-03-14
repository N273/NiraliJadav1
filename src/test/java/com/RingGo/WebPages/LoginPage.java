package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LoginPage extends driverManager {
     public void LoginLink() {
         WebElement LoginLink = driver.findElement(By.linkText("Log in"));
         Actions actions = new Actions(driver);
         actions.moveToElement(LoginLink).build().perform();

     }
       public void ClickLoginLink(){
         driver.findElement(By.linkText("Log in")).click();

       }
}
