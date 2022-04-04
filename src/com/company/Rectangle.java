package com.company;

public class Rectangle extends Figure {
   private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.setPerimeter(calculate_perimeter());
    }

    @Override
    public double calculate_area() {
        return length*width;
    }

    @Override
    public double calculate_perimeter() {
        return (length+width)*2;
    }

    @Override
    public String info() {
        return "Rectangle length: "+length+ " "+unit+
                " \nwidth: " +width +" "+unit+
                "\nPerimeter: "+calculate_perimeter()+" "+unit+ "\nArea: "+" "+calculate_area()+" "+unit;
    }
}

