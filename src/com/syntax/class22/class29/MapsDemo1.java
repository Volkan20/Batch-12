package com.syntax.class22.class29;

import java.util.ArrayList;
import java.util.HashMap;

public class MapsDemo1 {
    public static void main(String[] args) {
//ArrayList can use index / Map cant use any index
        ArrayList<String> names=new ArrayList<>();
        names.add("Ashgar");
        names.add("Muhammad");
        System.out.println(names.get(0));


        HashMap<Integer,String> map = new HashMap<>();
        map.put(12345,"Volkan Dereli");
        System.out.println(map.get(12345));
        map.put(456,"Hakan");
        System.out.println(map.get(456));

        HashMap<String,String> groceries = new HashMap<>();
        groceries.put("Lily","egg,milk");
        groceries.put("Suzanna","iceCream, Chocalate");
        System.out.println(groceries.get("Suzanna"));

    }
}
