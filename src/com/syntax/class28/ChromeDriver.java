package com.syntax.class28;

public class ChromeDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Code to open Chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Code to close Chrome browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Code to maximize window in Chrome ");
    }

    @Override
    public void findElement() {
        System.out.println("Code to find element in Chrome");
    }
}
