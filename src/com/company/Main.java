package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = {
                new Square(7),
                new Square(3)};
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].info());
            System.out.println("________________________________________");
        }

        Rectangle[] rectangles = {
                new Rectangle(5, 6),
                new Rectangle(5, 6),
                new Rectangle(7, 6)};
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(rectangles[i].info());
            System.out.println("__________________________________________");
        }
    }
}
