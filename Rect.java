package com.sd.ch8;

public class Rect extends Shape {
  private double width;
  private double height;
  private double area;
  private double perimeter;
  
  public Rect(double w, double h) {
    this.width = w;
    this.height = h;
    this.area = w*h;
    this.perimeter = 2*(w+h);
  }
  public double calcArea() {
    return this.area;
  }
  public double calcPerimeter() {
    return this.perimeter;
  }
  public String toString() {
    return "Rect..."+super.toString();
  }
  public static void main(String[] args) {
    Rect r=new Rect(10.0, 20.0);
    System.out.println("area = "+r.calcArea());
    System.out.println("perimeter = " + r.calcPerimeter());
    System.out.print(r.toString());
  }
}