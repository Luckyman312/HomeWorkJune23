package com.company;

public class Cat implements CanRun,CanClimb {
    @Override
    public void run() {
        System.out.println("Cat can run !");

    }

    @Override
    public void climb() {
        System.out.println("Cat can climb !");

    }
}