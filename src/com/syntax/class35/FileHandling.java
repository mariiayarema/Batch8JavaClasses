package com.syntax.class35;

import org.apache.poi.sl.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileHandling {
    public static void main(String[] args) throws IOException, InterruptedException {
        String path = "/Users/mariiayarema/eclipse-workspace/JavaBatch8Yarema/src/com/syntax/class35/Credentials.properties";
        String path2 = "/Users/mariiayarema/eclipse-workspace/JavaBatch8Yarema/src/com/syntax/class35/Credentials.properties";
        // we have a class in java to create a connection between file and code
        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(path2);

//inside Property class we have method that will help us read info from file

        Properties properties = new Properties();
        // properties.load(fileInputStream);
        String userName = (String) properties.get("username");
        String pass = (String) properties.get("password");

        // or String username=properties.getProperty("username")
        // or String pass=properties.getProperty(password);


        //to store data to a file
        properties.setProperty("phoneNumber", "111111");
        properties.store(fileOutputStream, "Changing the number");


        System.setProperty("webdriver.chrom.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://facebook.com");
        driver.findElement(By.id("email")).sendKeys(userName);
        driver.findElement(By.id("pass")).sendKeys(pass);

        //to write data to file:
        //BEFORE make a changes need to load otherwize it will create new file only with password
        //properties.setProperty("password","Syntax123")
        //properties.store(fileOutputStream,"change the password");

    }
}
