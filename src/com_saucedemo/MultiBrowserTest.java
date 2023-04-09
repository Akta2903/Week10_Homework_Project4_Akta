package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest
{
        static String baseUrl = "https://www.saucedemo.com/" ;
        static String browser = "Edge";
        static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome"))
            driver =new ChromeDriver(); // Launch the Chrome browser
        else if (browser.equalsIgnoreCase("Firefox"))
            driver = new FirefoxDriver(); // Launch the Firefox browser
        else if(browser.equalsIgnoreCase("Edge"))
            driver = new EdgeDriver(); //Launch the Edge
        else
            System.out.println("Give the Browser name between Chrome,Firefox,Edge");
        driver.get(baseUrl);
        System.out.println("Page Title : " + driver.getTitle()); // Print the page title
        System.out.println("Current Title : " + driver.getCurrentUrl()); // Print the Current Title
        System.out.println("Page Source : " + driver.getPageSource()); // Print the Page source
        driver.findElement(By.id("user-name")).sendKeys("Prime102"); // Enter the username into username field
        driver.findElement(By.id("password")).sendKeys("Prime@102"); //Enter the password into Password field
        driver.close(); // closing the browser
    }
}
