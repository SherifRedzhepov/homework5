package org.example;

public class Parrot extends Pet{

    public Parrot (byte age , String name , String breed , String sex , float weight , String color){
        super(age , name , breed , sex , weight , color);
    }

    @Override
    public void speak() {
        System.out.printf("%s is a talking parrot. %s knows 520 words.\n",getName(), getName());
    }

    @Override
    public void eat() {
        System.out.printf("%s likes to eat fruit , vegetable , grains , nuts ...\n",getName());
    }
}
