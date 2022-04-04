package com. company;

public class Square extends Figure {

    private double side_length;

    public Square(double side_length) {
        this.side_length = side_length;
        this.setPerimeter(calculate_perimeter());
    }

    @Override
    public double calculate_area() {
        return side_length*side_length;
    }

    @Override
    public double calculate_perimeter() {
    return side_length*4;
    }

    @Override
    public String info() {
        return "Square area: "+calculate_area()+ " "+unit+ " "+
                "\nPerimeter: "+calculate_perimeter()+unit;
    }
}

