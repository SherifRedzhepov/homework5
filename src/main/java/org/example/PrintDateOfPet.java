package org.example;

public class PrintDateOfPet {

    public static void main(String[] args) {
        Dog mecho = new Dog((byte)2 , "Mecho" , "rottweiler" , "male", 56f , "black");
        Parrot roger = new Parrot((byte)7 , "Roger" , "budgerigar" , "male", 0.035f, "green");

        mecho.printDataPet();
        mecho.eat();
        mecho.speak();

        System.out.println();

        roger.printDataPet();
        roger.eat();
        roger.speak();
    }
}