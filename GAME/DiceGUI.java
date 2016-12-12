package com.sd.game; 

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import com.sd.game.*;

public class DiceGUI extends JFrame implements ActionListener { 
   JTextField player1Tf; 
   JTextField player2Tf; 
   JTextField winnerTf; 
   JButton b1; 
   JButton b2,b3;

   public DiceGUI() { 
      setTitle("The Game Of Dice"); 
      JPanel panel = new JPanel(new GridLayout(3,2)); 
      getContentPane().add(panel); 
       
      JLabel label1=new JLabel("Player 1 Name"); 
      JLabel label2=new JLabel("Player 2 Name"); 
      JLabel label3 = new JLabel("Winer"); 
       
      player1Tf=new JTextField(10); 
      player2Tf=new JTextField(10); 
      winnerTf = new JTextField(10); 
      b1=new JButton("Start Game"); 
      b2=new JButton("Clear");
   //   b3=new JButton("Clear"); 
      b1.addActionListener(this); 
      b2.addActionListener(this); 
     // b3.addActionListener(this);       
	  panel.add(label1); 
      panel.add(label2); 
      panel.add(label3); 
      panel.add(player1Tf); 
      panel.add(player2Tf); 
      panel.add(winnerTf); 
      panel.add(b1); 
      panel.add(b2);    
   } 
    
   public void actionPerformed(ActionEvent e) { 
      JButton b = (JButton)e.getSource(); 
      if (b == b1) { 
            b1.setText("Click clear button -->");
            String name1 = player1Tf.getText(); 
            String name2 = player2Tf.getText();
            DiceGame game=new DiceGame(name1,name2);
            game.play();
            player1Tf.setText(player1Tf.getText()+" : "+String.valueOf(game.getP1().getNum())); 
            player2Tf.setText(player2Tf.getText()+" : "+String.valueOf(game.getP2().getNum())); 
            winnerTf.setText(game.vs()); 
         } 
       
      else if (b == b2) { 
         player1Tf.setText(""); 
         player2Tf.setText(""); 
         winnerTf.setText(""); 
         b1.setText("Replay"); 
    
       } 
   } 
    
   public static void main(String[] args) { 
      DiceGUI gui = new DiceGUI(); 
      gui.setDefaultCloseOperation(EXIT_ON_CLOSE); 
      gui.pack(); 
      gui.setVisible(true); 
   } 
} 
