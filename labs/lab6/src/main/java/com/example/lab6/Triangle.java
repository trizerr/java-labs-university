package com.example.lab6;

public class Triangle {
    private double a;
    private double b;
    private double c;
    private double inRadius;
    private double outRadius;
    private double area;

    private static Triangle instance;

    private Triangle(){
    }

    private Triangle(double a, double b, double c) {
        if(c * c == a * a + b * b) {
            this.a = a;
            this.b = b;
            this.c = c;
            area = 0.5 * a * b;
            inRadius = a * b / (a + b + c);
            outRadius = c / 2;
        }
        else throw  new IllegalArgumentException("Not a right triangle");
    }

    public static Triangle getInstance(){
        if (instance == null)
            instance = new Triangle();
        return instance;
    }

    public static void createNewTriangle(double a, double b, double c){
        instance = new Triangle(a, b, c);
    }

    public static Triangle getInstance(double a, double b, double c){
        if (instance == null)
            instance = new Triangle(a, b, c);
        return instance;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getInRadius() {
        return inRadius;
    }

    public void setInRadius(double inRadius) {
        this.inRadius = inRadius;
    }

    public double getOutRadius() {
        return outRadius;
    }

    public void setOutRadius(double outRadius) {
        this.outRadius = outRadius;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", inRadius=" + inRadius +
                ", outRadius=" + outRadius +
                ", area=" + area +
                '}';
    }
}
