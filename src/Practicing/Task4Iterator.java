package Practicing;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();

        for(int i=2; i<50; i+=2){
            num.add(i);
        }
        Iterator<Integer> it=num.iterator();
        while(it.hasNext()){
            if(it.next()%5==0){
                it.remove();
            }
        }
        System.out.println(num);
    }
}
