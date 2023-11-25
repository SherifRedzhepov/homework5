package org.example;

public class Pet {

    private byte age;
    private String name;
    private String breed;
    private String sex;
    private float weight;
    private  String color;

    public void setAge(byte age) {
        if (age > 0){
            this.age = age;
        }
        else {
            System.out.println("Error: Invalid entry for age");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }
        else {
            System.out.println("Error: Invalid entry for name");
        }
    }
    public void setBreed(String breed) {
        if (!breed.isEmpty()){
            this.breed = breed;
        }
        else {
            System.out.println("Error: Invalid entry for breed");
        }
    }
    public void setSex(String sex) {
        if (!sex.isEmpty()){
            this.sex = sex;
        }
        else {
            System.out.println("Error: Invalid entry for sex");
        }
    }
    public void setWeight(float weight) {
        if (weight >= 0){
            this.weight = weight;
        }
        else {
            System.out.println("Error: Invalid entry for weight");
        }
    }
    public void setColor(String color) {
        if (!color.isEmpty()){
            this.color = color;
        }
        else {
            System.out.println("Error: Invalid entry for color");
        }
    }

    public Pet (byte age , String name , String breed , String sex , float weight , String color){//constructor with parameter
        setAge(age);
        setName(name);
        setBreed(breed);
        setSex(sex);
        setWeight(weight);
        setColor(color);
    }
    public void eat (){
        System.out.printf("%s is eating..\n",name);
    }
    public void speak(){
        System.out.println( name + "is speak");
    }
    public void printDataPet(){
        System.out.printf( "%s is %d years old. It is %s sex and weight %.3f kg. " +
                "Color of %s is %s and it is %s breed. \n",name , age , sex ,weight,name,color,breed);
    }
}
