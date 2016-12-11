package com.sd.gui;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class CalcAreaGUIMain2 extends JFrame implements ActionListener{
  JTextField radiusTf; 
  JTextField areaTf; 
  JButton b1; 
  JButton b2;
  public CalcAreaGUIMain2(){
    //Frame f=new JFrame();
    JPanel panel = new JPanel(new GridLayout(3,2));
    getContentPane().add(panel);
    JLabel label1 = new JLabel("Radius");
    JLabel label2 = new JLabel("Area");
    radiusTf = new JTextField(10);
    areaTf= new JTextField(10);
    b1=new JButton("calculation"); 
    b2=new JButton("cancle"); 
    b1.addActionListener(this); 
    b2.addActionListener(this); 
    panel.add(label1); 
    panel.add(radiusTf);
    panel.add(label2);  
    panel.add(areaTf); 
    panel.add(b1); 
    panel.add(b2); 
    
  }
  public void actionPerformed(ActionEvent e) {
    JButton b=(JButton)e.getSource();
    if (b == b1) {
      b.setText("CalcArea.");
      //b2.setText("XX");
      Double r=Double.parseDouble(radiusTf.getText());
      areaTf.setText(Double.toString(r*r*Math.PI));
    }
    else if(b == b2){
      radiusTf.setText("");
      areaTf.setText("");
    }
  }
  public static void main(String[] args) {
    CalcAreaGUIMain2 c = new CalcAreaGUIMain2();
    c.setDefaultCloseOperation(EXIT_ON_CLOSE);
    c.pack();
    c.setVisible(true);
  }
}
