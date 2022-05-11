package com.syntax.class25;

public class Task2 {
   /*
   Create a WebDriver Interface that will have the following unimplemented
   behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement().
   Create 2 classes
   that implements WebDriver interface: ChromeDriver and FirefoxDriver.
    */
}

class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Firefox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Firefox Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing the FireFox Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Finding elements on Firefox browser");
    }

    @Override
    public void get(String s) {

    }
}
