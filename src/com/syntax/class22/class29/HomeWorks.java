package com.syntax.class22.class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class HomeWorks {
    //How can you remove all duplicates from the ArrayList

        public static void main(String[] args) {

            List<String> aList=new ArrayList<>();
            aList.add("John");
            aList.add("Jane");
            aList.add("James");
            aList.add("Jasmine");
            aList.add("Jane");
            aList.add("James");
            LinkedHashSet linkedHashSet=new LinkedHashSet(aList);
            aList.clear(); //if you not clear, it will add one more time
            aList.addAll(linkedHashSet);
            System.out.println(aList);

        }
    }

