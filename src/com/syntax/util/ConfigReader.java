package com.syntax.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static String getProperty(String key) throws IOException {

//first step location the file that we can want to read.
            String path="Files/Config.properties";
// navigating to that location
            FileInputStream fileInputStream=new FileInputStream(path);
// that special class which knows how to read the properties file
            Properties properties=new Properties();
// loading all the data from the file to properties objects
            properties.load(fileInputStream);
            return properties.getProperty(key);
        }
}
