package com.syntax.class28;

public class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Code to open Firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Code to close Firefox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Code to maximize window in Firefox ");
    }

    @Override
    public void findElement() {
        System.out.println("Code to find element in Firefox");
    }
}
