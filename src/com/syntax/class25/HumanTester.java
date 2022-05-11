package com.syntax.class25;


public class HumanTester {
    public static void main(String[] args) {
        Maha maha=new Maha();
        maha.walk();
        //  Maha.printLegs();
        Human.printLegs();
        LivingBeing.printLegs();
        WebDriver webDriver=new FirefoxDriver();
        webDriver.get("www.google.com");
    }
}
