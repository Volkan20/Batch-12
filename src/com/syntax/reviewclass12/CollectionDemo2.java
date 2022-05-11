package com.syntax.reviewclass12;

import java.util.ArrayList;

public class CollectionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Mango");

        fruit.remove("Mango");
        System.out.println(fruit);

    ArrayList<Fruit> f=new ArrayList<>();
    f.add(new Fruit("Apple"));
    f.add(new Fruit("Orange"));
    f.add(new Fruit("Mango"));
    f.remove(new Fruit("Mango"));
        System.out.println(f);

    }
}
class Fruit{
    String name;
    Fruit(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';

    }
}

