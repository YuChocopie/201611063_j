package com.sd.ch8;

public class Hello {
  private String name;
  public Hello(String name) {
    this.name=name;
  }
  public void sayHello(){
    System.out.println("Hello "+name);
  }
  public static void main(String[] args) {
    Hello[] h = new Hello[5];
    h[0]= new Hello("yj");
    h[1]= new Hello("sy");
    h[2]= new Hello("jy");
    h[3]= new Hello("jh");
    h[4]= new Hello("sj");
    for(int i=0;i<h.length;i++)
      h[i].sayHello();
  }
  
}