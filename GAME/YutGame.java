package com.sd.game;

public class YutGame {
  protected Player p1;
  protected Player p2;
  public YutGame (String name1, String name2) {
    p1=new Player(name1);
    p2=new Player(name2);
  }
  public void play(){
    p1.play(2);
    p2.play(2);
  }
  public Player getP1() {
    return p1;
  }
  public Player getP2() {
    return p2;
  }
  //public String nory1(){
  //  return p1.getName() + p1.getYut();
  //}
  //public String nory2(){
  //  return p2.getName() + p2.getYut();
  //}
}  