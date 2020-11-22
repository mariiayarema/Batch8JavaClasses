package com.syntax.GroupProject2Task5;

public class ChromeDriver implements RemoteWebDriver {
    String title;
    ChromeDriver(String title){
    this.title=title;
    }
    @Override
    public void navigate() {
        System.out.println("Navigate to Chrome Browser");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Getting screenshot in Chrome opened window");
    }

    @Override
    public void open() {
        System.out.println("Opening Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome Browser");
    }

    @Override
    public String getTitle() {

        return title ;
    }
}
