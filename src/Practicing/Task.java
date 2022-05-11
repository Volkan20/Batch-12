package Practicing;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("Totota");
        cars.add("Tesla");
        cars.add("Mercedes");
        cars.add("Tesla");

        cars.removeIf(s -> s.toLowerCase().endsWith("a"));
        System.out.println(cars);


        /*for(String car:cars){
            System.out.println(car);
        }

        for(int i=0; i< cars.size(); i++){
            System.out.println(cars);
        }

        int i=0;
        while(i< cars.size()){
            System.out.println(cars.get(i));
            i++;
        }

        Iterator<String> it=cars.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    */
    }
}
