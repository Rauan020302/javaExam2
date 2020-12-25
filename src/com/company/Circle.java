package com.company;

public class Circle {
    int radius;
    final double PI = 3.14;
    static int numOfCircle;

    public Circle(){}
    public Circle(int radius) {
        this.radius = radius;
    }

    public double S(int radius) {
        return PI * radius * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {



        Circle[] circles = new Circle[10];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i + 1);
            System.out.println(circles[i].S(i));
            if (circles[i].getRadius() % 3 ==0) {
             numOfCircle++;
            }

        }
        System.out.println(numOfCircle);


    }
}
