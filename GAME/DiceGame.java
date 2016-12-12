package com.sd.game;

public class DiceGame {
  protected Player p1;
  protected Player p2;
  public DiceGame (String name1, String name2) {
    p1=new Player(name1);
    p2=new Player(name2);
  }
  public void play(){
    p1.play(1);
    p2.play(1);
  }
  public Player getP1() {
    return p1;
  }
  public Player getP2() {
    return p2;
  }
  public String vs(){
    if (p1.getNum() > p2.getNum()) {
      return p1.getName() + " won";
    }
    else if (p1.getNum() == p2.getNum()) {
      return"draw";
    }
    else
      return p2.getName() + " won";
    
  }
}  