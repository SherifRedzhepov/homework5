package org.example;

public class Dog extends Pet{
    public Dog (byte age , String name , String breed , String sex , float weight , String color){
        super(age , name , breed , sex , weight , color);
    }

    @Override
    public void eat() {
        System.out.println( getName() + " eating a lot.");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " speaks using barking.");
    }
}