package com.syntax.reviewclass12;

public class StringUtil {
    public static boolean contains(String str, String regex){
        String newStr= str.replaceAll(regex,"");
        return newStr.equals(str);
    }
}
