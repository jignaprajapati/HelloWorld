package com.example.inheritance;
import java.util.logging.Logger;

public class Main {
    public static void main(String args[]) {
        Animal animal =  new Animal("Animal",1,1,5,5);
        Dog dog = new Dog("Yorkie",20,4,5,7);
        dog.eat();
        animal.eat();
        dog.walk();
        dog.run();
        dog.move(20);

        GearBox newGear = new GearBox();
        newGear.powerOn();
        newGear.dial(123456);

        // Instantiating the outer class
        InnerClass outer = new InnerClass();

        // Accessing the display_Inner() method.
        outer.display_Inner();
        System.out.println();
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.info("Hello world");

    }
}


