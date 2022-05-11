package com.syntax.class27;

import java.util.ArrayList;

public class ClassTask {
    public static void main(String[] args) {

    ArrayList<String> names=new ArrayList<>();
        names.add("Volkan");
        names.add("Suzanna");
        names.add("Hakan");
        names.add("Gisel");
        names.add("Kamil");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Volkan"));
        System.out.println(names.size());
        System.out.println(names);

}}
