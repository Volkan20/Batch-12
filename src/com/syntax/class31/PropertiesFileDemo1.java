package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo1 {
    public static void main(String[] args) throws IOException {
//first step location the file that we can want to read.
        String path="/Users/BaySmokin/Desktop/Batch12 Slayts/Config.properties";
// navigating to that location
        FileInputStream fileInputStream=new FileInputStream(path);
// that special class which knows how to read the propertoes file
        Properties properties=new Properties();
// loading all the data from the file to properties objects
        properties.load(fileInputStream);

        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));



    }
}
