package com.example.inheritance;

public class GearBox implements Telephone {
    @Override
    public void powerOn(){
        System.out.println("There is network no coverage available");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing "+phoneNumber);
    }
}
