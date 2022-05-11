package com.syntax.class30;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {

        HashMap<String, Double> fruitMap = new HashMap<>();
        //fruitMap.put("Apple", 20);--> 20(double) --> auto casting doesn't work in collections and maps
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Kiwi",16.1);
        fruitMap.put("Orange",2.1);
        fruitMap.put("Mango",56.3);
        fruitMap.put("Banana",12.5);// duplicate values are overwritten last value is retained

        System.out.println(fruitMap);
        System.out.println(fruitMap.get("Kiwi"));//("KiwI") case sensitive
        fruitMap.remove("Mango");
        System.out.println(fruitMap);
        System.out.println(fruitMap.containsKey("Kiwi")); //true
        System.out.println(fruitMap.containsKey("Camel")); //false
        System.out.println(fruitMap.containsValue(20.0));
        System.out.println(fruitMap.isEmpty());
        System.out.println(fruitMap.size());
       fruitMap.replace("Banana",50.0);
        System.out.println(fruitMap);



    }
}
