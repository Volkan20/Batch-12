package com.syntax.class22.class29;

public class Task1 {

//Create a class Insurance that will have
// an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
// Create 3 subclasses Car, Pet, Health.
// Car class has it’s own attribute as carModel and Class Pet has petType attribute.
// Create 3 objects of the sub classes and store them in ArrayList.
// Using for loop/advanced for loop/ iterator access all methods of the class.

}
abstract class Insurance{
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }
    public abstract void getQuote();
    public abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;
    Car(String insuranceName, String carModel) {
        super(insuranceName);
    }
    @Override
    public void getQuote() {
        System.out.println("getting quote for a Car"+carModel+insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("please cancel my Car insurance"+carModel+insuranceName);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                '}';
    }
}

class Pet extends Insurance{
    String petType;

    Pet(String insuranceName,String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    public void getQuote() {
        System.out.println("getting quote for the Pet"+petType);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("cancel the insurance for the pet"+petType);
    }
}
class Health extends Insurance{
    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("getting quote for the Pet"+insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("cancel the insurance for the pet"+insuranceName);
    }
}