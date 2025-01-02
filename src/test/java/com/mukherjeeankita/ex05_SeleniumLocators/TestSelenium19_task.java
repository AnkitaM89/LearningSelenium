package com.mukherjeeankita.ex05_SeleniumLocators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium19_task {
    @Description("Checking the current URL")
    @Test
    public void test_Selenium01() throws InterruptedException {
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        //Open the URL
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        //Find the Make Appointment button
        WebElement makeAppointmentBtn = driver.findElement(By.id("btn-make-appointment"));
        //Click the button
        makeAppointmentBtn.click();

        Thread.sleep(3000);

        //Find the Username textbox
        WebElement username = driver.findElement(By.id("txt-username"));
        //Enter the username
        username.sendKeys("John Doe");
        //Find the password textbox
        WebElement password = driver.findElement(By.id("txt-password"));
        //Enter the password
        password.sendKeys("ThisIsNotAPassword");
        //Find and click the Login button
        driver.findElement(By.id("btn-login")).click();

        Thread.sleep(3000);
        //Compare the Current page URL with the expected URL
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        driver.quit();
    }
}
