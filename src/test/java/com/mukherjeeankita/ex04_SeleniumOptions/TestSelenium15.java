package com.mukherjeeankita.ex04_SeleniumOptions;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium15 {
    @Description("Ad blocker")
    @Test
    public void test_Selenium01()throws Exception
    {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addExtensions(new File("src/test/java/com/mukherjeeankita/ex04_SeleniumOptions/AdBlocker.crx"));
        WebDriver driver = new EdgeDriver(edgeOptions);
        //Proxy proxy = new Proxy();
        //proxy.setHttpProxy("188.255.245.205:1080");
        //edgeOptions.setCapability("proxy", proxy);

        driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc");
    }
}
