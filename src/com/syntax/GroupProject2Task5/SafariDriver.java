package com.syntax.GroupProject2Task5;

public class SafariDriver implements RemoteWebDriver {
    String title;
    SafariDriver(String title){
        this.title=title;
    }
    @Override
    public void navigate() {
        System.out.println("Navigate to Safari Browser");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Getting screenshot in Safari opened window");
    }

    @Override
    public void open() {
        System.out.println("Opening Safari Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Safari Browser");
    }

    @Override
    public String getTitle() {
        return title;
    }
}
