package com.syntax.class28;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {
        System.out.println("hi");
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver chromeDriver= new ChromeDriver();
        chromeDriver.get("https://www.google.com/");
    }
}
