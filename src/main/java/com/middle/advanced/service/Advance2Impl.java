package com.middle.advanced.service;

public class Advance2Impl implements Advace2 {
    @Override
    public void greetedTo(String name) {
        System.out.println("Advance2Impl-->greetedTo ");
    }

    @Override
    public void serviceTo(String name) {
        System.out.println("Advance2Impl-->serviceTo ");
    }

    @Override
    public void goodBye(String name) {
        System.out.println("Advance2Impl-->goodBye ");
    }
}
