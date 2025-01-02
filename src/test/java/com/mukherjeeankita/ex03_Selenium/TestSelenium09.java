package com.mukherjeeankita.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium09 {
    @Description("Checking with assetEquals")
    @Test
    public void test_Selenium01()
    {
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        Assert.assertEquals(driver.getTitle(),"Google");
    }
}
