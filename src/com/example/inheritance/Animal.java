package com.example.inheritance;

class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name,int brain,int body,int size,int weight){
        this.body=body;
        System.out.println(this.body);
    }
    public void eat(){
        System.out.println("Animal.eat() called");
    }
    public void chew(){
        System.out.println("Animal.chew() called");
    }
    public void move(int speed){
        System.out.println("Animal is moving at "+ speed);
    }

    public static class GearBox {

    }
}
