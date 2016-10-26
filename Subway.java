public class Subway {
    int line;
    public void run() {
        System.out.println(line+"line runs");
    }
    public void setLine(int l){
        line=l;
    }
    public static void main(String[] args) {
      Subway mySub=new Subway();
      mySub.setLine(3)
      mySub.run()
    }
}