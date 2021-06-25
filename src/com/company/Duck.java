package com.company;

public class Duck implements CanRun, CanFly {
    @Override
    public void run() {
        System.out.println("Duck can run!");
    }

    @Override
    public void fly() {
        System.out.println("Duck can fly");

    }
}
