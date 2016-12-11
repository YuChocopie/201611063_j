package com.sd.gui;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class CalcAreaGUIMain2 extends JFrame implements ActionListener{
  JTextField radiusTf1;
  JTextField areaTf2;
  JButton b1;
  JButton b2;
  public CalcAreaGUIMain2(){
    //Frame f=new JFrame();
    JPanel panel = new JPanel(new GridLayout(3,2));
    getContentPane().add(panel);
    JLabel label1 = new JLabel("Radius");
    JLabel label2 = new JLabel("Area");
    radiusTf1 = new JTextField(10);
    areaTf2= new JTextField(10);
    JButton b1 = new JButton("Compute");
    JButton b2 = new JButton("Cancel");
    b1.addActionListener(this);
    b2.addActionListener(this);
    panel.add(label1);
    panel.add(radiusTf1);
    panel.add(label2);
    panel.add(areaTf2);
    panel.add(b1);
    panel.add(b2);
    
  }
  public void actionPerformed(ActionEvent e) {
    JButton b=(JButton)e.getSource();
    if (b == b1) {
      b.setText("CalcArea.");
      //b2.setText("XX");
      Double r=Double.parseDouble(radiusTf1.getText());
      areaTf2.setText(Double.toString(r*r*Math.PI));
    }
    else {
      radiusTf1.setText("");
      areaTf2.setText("");
    }
  }
  public static void main(String[] args) {
    CalcAreaGUIMain2 c = new CalcAreaGUIMain2();
    c.setDefaultCloseOperation(EXIT_ON_CLOSE);
    c.pack();
    c.setVisible(true);
  }
}
