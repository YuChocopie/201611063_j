import java.util.Scanner;
public class Temperture {
  public static void main(String[] args) {
 
    int typeChoice= 0;
    
    System.out.println("C->F ��1���� �Է��ϼ���");
    System.out.println("F->C�� 2���� �Է��ϼ���");
    
    Scanner cf = new Scanner(System.in);
    typeChoice = cf.nextInt();
    
    if( typeChoice == 1 ) {
      System.out.println("user input C");
      System.out.println("������ �Է����ּ���");
      int cel = cf.nextInt();
      double fah = cel*1.8+32;
      System.out.println( fah);
      } 
      
    else if ( typeChoice == 2 ) {
      System.out.println("user input F");
      System.out.println("ȭ���� �Է����ּ���");
      int fah = cf.nextInt();
      double cel = (fah - 32)/1.8;
      System.out.println(cel);
      } 
      
    else {
      System.out.println("user input error.");
      }
    }
}    
    