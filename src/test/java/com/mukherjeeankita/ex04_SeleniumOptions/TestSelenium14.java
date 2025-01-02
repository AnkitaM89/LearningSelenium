package com.mukherjeeankita.ex04_SeleniumOptions;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium14 {
    @Description("Trying options")
    @Test
    public void test_Selenium01() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--window-size=1280,720");
        //edgeOptions.addArguments("--window-size=800,600");
        //edgeOptions.addArguments("--incognito");
        //edgeOptions.addArguments("--start-maximized");
       // edgeOptions.addArguments("--headless");
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://google.com");
        Thread.sleep(10000);
        //driver.quit();
    }
}
