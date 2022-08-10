package com.company.cirandcyl;

public class Cylinder extends Circle{
    private double height= 2.0;
    Cylinder(){
    }
    Cylinder(double height){
        this.height=height;
    }
    Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
//    @Override
//    public void setRadius(double radius){
//        setRadius(radius);
//    }
//    @Override
//    public double getRadius(){
//        return getRadius();
//    }
    @Override
    public double getArea(){
        return 2*Math.PI*getRadius()*(getRadius()+height);
    }
    public double getVolume(){
        return Math.PI*getRadius()*getRadius()*height;
    }
    @Override
    public String toString() {
        return "height" +
                getHeight() +
                super.toString()
                + "Volume" +
                getVolume();
    }
}
