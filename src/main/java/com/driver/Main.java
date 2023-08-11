package com.driver;

public class Main {

    public static void main(String[] args) {

        RWOnly x = new RWOnly();

        x.name = "Rajesh";
        System.out.println(x.name);

        x.setName("Michael");
        System.out.println(x.getName());

    }
}