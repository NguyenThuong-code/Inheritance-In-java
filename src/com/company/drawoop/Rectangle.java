package com.company.drawoop;

public class Rectangle extends Shape{
    private double width= 1.0;
    private double height= 1.0;
    Rectangle(){}
    Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width= width;
        this.height= height;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getHeight(){
        return height;
    }
    public void  setHeight(double height){
        this.height=height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return (width+height)/2;
    }
    @Override
    public String toString(){
 return "A Rectangle with width: "+
        getWidth() +" length: "+ getHeight()+
        ", which is a subclass of "+
        super.toString();
    }
}
