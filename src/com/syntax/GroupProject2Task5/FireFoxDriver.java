package com.syntax.GroupProject2Task5;

public class FireFoxDriver implements RemoteWebDriver{
    String title;
    FireFoxDriver(String title){
        this.title=title;
    }
    @Override
    public void navigate() {
        System.out.println("Navigate to FireFox Browser");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Getting screenshot in Firefox opened window");
    }

    @Override
    public void open() {
        System.out.println("Opening Safari Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing FireFox Browser");
    }

    @Override
    public String getTitle() {
        return title;
    }
}
