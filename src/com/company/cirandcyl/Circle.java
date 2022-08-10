package com.company.cirandcyl;

public class Circle {
    private double radius= 2;
    private String color ="white";
    public Circle(){
    }
    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color=color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    public String toString(){
        return
                         "Radius"+
                         getRadius()+
                         "Color"+
                        getColor()+
                        "the Area"+
                        getArea();
    }
}
