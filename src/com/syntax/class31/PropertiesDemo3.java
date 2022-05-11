package com.syntax.class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo3 {
    public static void main(String[] args) throws IOException {
        String path="/Users/BaySmokin/Desktop/Batch12 Slayts/trump.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.put("IsCarzy","true");
        properties.put("IsRich","true");
        properties.store(fileOutputStream,"Added some new fields");


    }
}
