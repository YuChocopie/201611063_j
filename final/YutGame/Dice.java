
public class Dice {
  private int number =0;
  public int roll() {
    number = (int) (Math.random() *6) +1 ;
    return number;
  }
  public int getNum() {
    return number;
  }
} 