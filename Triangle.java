import ch.aplu.turtle.*;
public class Triangle {
  static Turtle t1 = new Turtle();
  public void triangle(int size) {
    for (int i=0;i<3;i++) {
      t1.fd(size);
      t1.rt(120);
    }
  }
  public static void main(String[] args) {
    Triangle t=new Triangle();
    t.triangle(40);
  }
}