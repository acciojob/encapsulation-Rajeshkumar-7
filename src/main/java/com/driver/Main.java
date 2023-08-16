package com.driver;

public class Main {

    public static void main(String[] args) {

        RWOnly x = new RWOnly();

        // x.name = "Rajesh";
        // name has private access in 'com.driver.RWOnly'

        x.setName("Rajesh");
        x.getName();

    }
}