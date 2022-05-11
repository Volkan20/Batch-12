package com.syntax.reviewclass9;

public class Doctor {
    //instance variables - declared inside the class but outside of any method, constr.
    String firstName, lastName,speciality;

    //static variables -> declared inside the class but outside of any methods
    //
    //
    static String hospital="Jorge Washington";

//static methods can access only static members
    static void work(){
        System.out.println("All doctors work at "+hospital);
    }

    Doctor(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    void printInfo(){
        System.out.println("Doctor "+firstName+" "+lastName+" is a "+speciality);
    }
//non-static methods can access static members
     void work1(){
         System.out.println("All doctors work at "+hospital);
     }
//static method can't access non-static members
     /* static void printInfo(){
         System.out.println("Doctor "+firstName+" "+lastName+" is a "+speciality);
     }*/

}
