package com.sd.game;
import ch.aplu.turtle.*;
import com.sd.game.*;

public class ATurtle {
	Turtle t1 = new Turtle();
	public void ATurtle1(double x1, double y1){ 
		t1.penUp(); 
 		t1.setPos(x1,y1); 
		t1.penDown();
		t1.setHeading(0);
	}
	public void color1(String color){
		t1.setPenColor (color);
	}

	public void go1(int x1){
		t1.fd(20*x1);
	}
	public void back1(){
		t1.back(20);
	}
}