package com.company.drawoop;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle =new Circle();
        System.out.println(circle);
        circle=new Circle(3.5);
        System.out.println(circle);
        circle=new Circle(3.7,"white", false);
        System.out.println(circle);
    }
}
