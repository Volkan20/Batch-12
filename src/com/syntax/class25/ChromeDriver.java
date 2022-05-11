package com.syntax.class25;

public class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Opening Chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Chrome Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Chrome Window");
    }

    @Override
    public void findElement() {
        System.out.println("Finding elements in Chrome browser ");
    }

    @Override
    public void get(String s) {

    }
}
