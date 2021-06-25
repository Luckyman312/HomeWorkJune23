package com.company;

public class Tiger implements CanClimb,CanRun{
    @Override
    public void climb() {
        System.out.println("Tiger can climb !");
    }

    @Override
    public void run() {
        System.out.println("Tiger can run !");
    }
}
