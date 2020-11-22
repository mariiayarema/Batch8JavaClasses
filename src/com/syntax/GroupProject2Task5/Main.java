package com.syntax.GroupProject2Task5;

public class Main {
    public static void main(String[] args) {
        RemoteWebDriver [] browsers={
                new ChromeDriver("Chrome Browser"),
                new SafariDriver("Safari Browser"),
                new FireFoxDriver("FireFox Browser")
        };
        for (RemoteWebDriver bb:browsers) {
            bb.navigate();
            bb.open();
            bb.close();
            bb.getScreenshot();
            bb.getTitle();

        }
    }
}
