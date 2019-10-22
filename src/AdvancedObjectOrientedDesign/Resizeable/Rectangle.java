package AdvancedObjectOrientedDesign.Resizeable;

import java.util.Random;

public class Rectangle extends Shape implements Resizeable{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {

        System.out.println("Rectangle: \n"+"Width: "+
                + getWidth()
                + " and length="
                + getLength()+"\nDien tich: "+getArea()+"\nChuvi: "+getPerimeter()
                +"\nDien tich sau khi tang ti le ngau nhien: \n"+"Dien tich: "+getArea()*percent/100+getArea()+"\nChu vi: "+getPerimeter()*percent/100+getPerimeter())
        ;
    }
}
