import ch.aplu.turtle.*;

public class Square {
  static Turtle t1 = new Turtle();
    public void drawSqare(int size) {
      for(int i=0;i<4;i++){
        t1.fd(size);
        t1.rt(90);
    }
  }
  public static void main(String[]args){
    Square s=new Square();
    s.drawSqare(50);
  }
} 

