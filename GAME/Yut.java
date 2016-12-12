package com.sd.game;
import java.util.Scanner;
import ch.aplu.turtle.*;
import com.sd.game.*;

public class Yut {
	String yut;
	int a,c;
	int d;
	int b=(int)(Math.random()*2);
//	ATurtle at1=new ATurtle();
//	ATurtle at2=new ATurtle();
	public void Yut() { 
		//int[] a=new int[3];
		int[] a = {(int)(Math.random()*2),(int)(Math.random()*2),(int)(Math.random()*2)};
		for (int i=0; i<3; i++) {
			c += a[i];
		}
		d=c+b;
		System.out.printf("\n*%d, %d, %d, %d\n",b,a[0],a[1],a[2]);
	}
	public void random() {
//		at1.ATurtle1(-200,100);
//		at2.ATurtle1(200,100);
//		at1.color1("pink");
//		at2.color1("sky");
		if (c==0 && b==0){
			yut="Mo";
//			at1.go1(5);
//			at2.go1(5);
		}
		else if (c==0 && b==1){
			yut="BackDo";
//			at1.back1();
//			at2.back1();
		}
		else if (c==1 && b==0){
			yut="Do";
//			at1.go1(1);
//			at2.go1(1);
		}
		else if (d==2){
			yut="Ga";
//			at1.go1(2);
//			at2.go1(2);
		}
		else if (d==3){
			yut="Ger";
//			at1.go1(3);
//			at2.go1(3);
		}
		else if (d==4){
			yut="Yut";
//			at1.go1(4);
//			at2.go1(4);
		}
	}
	public String getYut() { 
		return yut;
	}
	public static void main(String[] args) {
		Yut y=new Yut();
		y.Yut();
		y.random();
		System.out.print(y.yut);
	}
}