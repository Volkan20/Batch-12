package com.syntax.class31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit= new HashMap<>();
        fruit.put("Apple",10.0);
        fruit.put("Orange",15.0);

        HashMap<String,Double> vegetable= new HashMap<>();
        vegetable.put("Onion",12.5);
        vegetable.put("Carrot",10.5);

        ArrayList<HashMap<String,Double>> list= new ArrayList<>();
        list.add(fruit);
        list.add(vegetable);
        System.out.println(list);


    }
}
