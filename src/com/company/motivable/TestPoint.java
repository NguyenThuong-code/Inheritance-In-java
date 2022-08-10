package com.company.motivable;

public class TestPoint {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint();
        System.out.println(movablePoint);
        movablePoint=new MovablePoint(1.0f,2.0f,3.0f,4.0f);
        System.out.println(movablePoint.move());


    }
}
