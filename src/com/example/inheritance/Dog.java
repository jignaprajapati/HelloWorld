package com.example.inheritance;

public class Dog extends Animal{

    public Dog(String name,int brain,int body,int size,int weight){
        super(name,brain,body,weight,size);
    }
    @Override
    public void eat(){
        System.out.println("Dog.eat() called");
        super.eat();
    }

    public void chew(){
        System.out.println("Dog.chew() called");
        super.eat();
    }
    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }
    @Override
    public void move(int speed){
        System.out.println("Dog.move is called");
        super.move(45);
    }

















}
