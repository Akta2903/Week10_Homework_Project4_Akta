package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver(); // Launch the Chrome browser
        driver.get(baseUrl); // open the Url
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        System.out.println("page Title : " + driver.getTitle()); // Print the Page Title
        System.out.println("Current Url : " + driver.getCurrentUrl()); //Print the Current url
        System.out.println("Page Source : " + driver.getPageSource()); // Print the Page source
        driver.findElement(By.id("user-name")).sendKeys("Prime102"); //Enter the username in username field
        driver.findElement(By.id("password")).sendKeys("Prime@102"); //Enter the password in password field

        driver.close(); // closing the browser
    }

}
