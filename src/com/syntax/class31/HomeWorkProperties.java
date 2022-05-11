package com.syntax.class31;

import javax.xml.bind.SchemaOutputResolver;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class HomeWorkProperties {
    public static void main(String[] args) throws IOException {
        String path= "Files/Facebook.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.put("Browser","Chrome");
        properties.put("URL","https://facebook.com");
        properties.put("username","Volkan");
        properties.put("password","volkan123");

        properties.store(fileOutputStream,"Facebook Homework");
        System.out.println(properties.get("browser"));
        System.out.println(properties.get("URL"));

    }
}
