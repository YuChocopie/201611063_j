import ch.aplu.turtle.*;
public class MakeSwirlSquare{
  public static void main(String[] args){
    MakeSwirlSquare baram = new MakeSwirlSquare();
      baram.makeSwirlSquare(0,15,20,90.0);
   }
  Turtle t1=new Turtle();
  public void makeSwirlSquare(int size, int bigger , int turns , double degree){
     int nBigger=2;
     for(int i=0;i<turns;i++){
       if(i%nBigger!=0){
         size+=bigger;
       }
       t1.fd(size);
       t1.rt(degree);
     }
  }
    
}