package com.polimorfizm;

public class Main {
    public static void main(String[] args) {
        Shape[] array = new Shape[] {new Circle(), new Square(), new Triangle()};
        for(int i = 0; i<array.length; i++)
            array[i].draw();
    }
}
