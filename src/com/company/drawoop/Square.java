package com.company.drawoop;

public class Square extends Rectangle{
    public Square(){
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side,String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setHeight(side);
        setWidth(side);
    }
    @Override
    public void setWidth(double width){
        setSide(width);
    }
    @Override
    public void setHeight(double height){
        setSide(height);
    }
    @Override
    public String toString(){
        return "A square with side="
                + getSide()
                +", which is a subclass of"
                + super.toString();
    }
}
