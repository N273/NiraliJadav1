package com.RingGo.WebPages;

import com.RingGo.driver.driverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.google.common.net.HostSpecifier.isValid;

public class RegisterPage extends driverManager {
    public void RegisterLink() {
        driver.findElement(By.linkText("Register")).click();
    }

    public String getPageTitle() {
        return driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
    }

    public void enterValidField(String mobile, String email,String password){

        driver.findElement(By.id("field-Member_CLI")).clear();
        driver.findElement(By.id("field-Member_CLI")).sendKeys(mobile);
        driver.findElement(By.id("field-Member_Email")).clear();
        driver.findElement(By.id("field-Member_Email")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"field-MemberPassword\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"field-MemberPassword\"]")).sendKeys(password);
    }


    public void clickTermsCondition(){
        WebElement element;
        element = driver.findElement(By.xpath("//body[1]/div[6]/div[1]/form[1]/fieldset[4]/ol[1]/li[1]/div[1]/div[1]/input[1]"));
        element.click();

    }
    public void clickNextButton(){
        driver.findElement(By.id("labyrinth_UserDetails_next")).click();
    }

    public void clickCancelButton(){
        driver.findElement(By.id("labyrinth_cancel")).click();
    }

  public void errorMobileMsg(String message){
      driver.findElement(By.id("field-Member_CLI")).getText();
  }
  public void termsConsent(){
        driver.findElement(By.linkText("Terms & Conditions")).click();
  }
    }








