package com.techproed.tests;

import com.techproed.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day07_IframeExample extends TestBase {

    @Test
    public void numberOfIframe() {
        driver.get("https://www.amazon.com");
        List<WebElement> iframeElements = driver.findElements(By.xpath("//iframe"));
        int iframeSize = iframeElements.size();
        System.out.println(iframeSize);
        //OR
        System.out.println(driver.findElements(By.tagName("iframe")).size());

        driver.get("https://the-internet.herokuapp.com/iframe");
        System.out.println(driver.findElements(By.xpath("//iframe")).size());
        System.out.println(driver.findElements(By.tagName("iframe")).size());
    }
    @After
    public void tearDown() {
        driver.close();
    }
}
