package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrom.driver","chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://facebook.com");
        driver.navigate().back();
        Thread.sleep(1000);  // pauses the thread for the given millis
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        //driver.close(); // close current tab
        driver.quit();    // will quit whole browser

    }
}
