package com.company;

public class Main {

    public static void main(String[] args) {

    Cat cat = new Cat();

    Dog dog = new Dog();

    Tiger tiger = new Tiger();

    Duck duck = new Duck();

    canRun(cat);
    canRun(dog);
    canRun(tiger);
    canRun(duck);

    canFly(duck);

    canClimb(cat);
    canClimb(tiger);

    
    }
    public static void canRun(CanRun canRun){
        canRun.run();
    }
    public static void canFly(CanFly canFly){
        canFly.fly();
    }
    public static void canClimb(CanClimb canClimb){
        canClimb.climb();
    }
}
