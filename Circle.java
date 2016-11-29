package com.sd.ch8;
//import com.sd.ch8.Turtle;
public class Circle extends Point {
    protected double radius;
    public Circle(int x, int y, double r){
        super(x,y);
        this.radius=r;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Circle myCircle = new Circle(10,10,5);
        Double myArea = myCircle.getArea();
        System.out.println(myArea);
    }
}