package com.syntax.class31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> vegetable= new ArrayList<>();
        vegetable.add("Potato");
        vegetable.add("Carrot");
        vegetable.add("Onion");

        ArrayList<String> fruit= new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Orange");

        Map<String,ArrayList<String>> healthyFood=new HashMap<>();
        healthyFood.put("Vegatables", vegetable);
        healthyFood.put("Fruits",fruit);

        System.out.println(healthyFood);

    }
}
