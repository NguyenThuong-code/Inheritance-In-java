package com.company.overgeo;

import java.util.Date;

public class SimpleGeometricObject {
    private String color= "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /**
     * Construct a default geometric object
     */
    public SimpleGeometricObject(){
        dateCreated = new java.util.Date();
    }
    /**
     * Construct a geometric object with the specified color
     * and filled value
     */
    public SimpleGeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color= color;
        this.filled= filled;
    }
    //return color
    public String getColor(){
        return color;
    }
    //set a new color
    public void setColor(String color){
        this.color=color;
    }
    /**
     * Return filled. Since filled is boolean,
     * its getter method is named isFilled
     */
    public boolean isFilled(){
        return filled;
    }
    //Set a new filled
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    //get dateCreated
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    /** Return a string representation of this object*/
    @Override
    public String toString() {
        return "\ncolor" +
                "color='" + color + '\'' +
                "and filled=" + filled +
                " created on" + dateCreated +
                '}';
    }
}