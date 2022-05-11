package com.syntax.class22.class29;

import java.util.ArrayList;

public class Task1Tester {
    public static void main(String[] args) {
        ArrayList<Insurance> insurances=new ArrayList<>();
        insurances.add(new Car("AdamsG","Tesla S"));
        insurances.add(new Pet("CamelIns","CamelsCar"));
        insurances.add(new Health("Volkiiy"));

        for(Insurance i:insurances){
           i.getQuote();
           i.cancelInsurance();
        }

    }
}
