package com.company;

public abstract class Figure {
    public static String unit = "cm";
    private double perimeter;

    public Figure(){

    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public abstract double calculate_area();

    public abstract double calculate_perimeter ();

    public abstract String info();
    }

