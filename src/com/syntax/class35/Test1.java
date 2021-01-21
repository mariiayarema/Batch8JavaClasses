package com.syntax.class35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test1 {
//    Create a property file to store following configurations:
//    browser=chrome
//    url=https://facebook.com
//    username
//    password
//    Read file and extract values of browser & url
    public static void main(String[] args) throws IOException {
        String path="/Users/mariiayarema/eclipse-workspace/JavaBatch8Yarema/src/com/syntax/class35/Crd.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        String browser=(String)properties.get("browser");
        String url=(String)properties.get("url");
        String username=(String)properties.get("username");
        String password=(String)properties.get("password");

        if(browser.contains("chrome")) {
            System.setProperty("webdriver.chrome.driver","chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            driver.findElement(By.id("email")).sendKeys(username);
            driver.findElement(By.id("pass")).sendKeys(password);
        }else if(browser.contains("firefox")){
            WebDriver driver = new FirefoxDriver();
            driver.get(url);
            driver.findElement(By.id("email")).sendKeys(username);
            driver.findElement(By.id("pass")).sendKeys(password);
        }else{
            System.out.println("Invalid browser");
        }

    }
}
//https://github.com/mozilla/geckodriver/releases