
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class YutGUI extends JFrame implements ActionListener { 
   JTextField player1Tf; 
   JTextField player2Tf; 
   JTextField yut1Tf; 
   JTextField yut2Tf; 
   JButton b1; 
   JButton b2,b3,b4;
   

   public YutGUI() { 
      setTitle("The Game Of Yutnory"); 
      JPanel panel = new JPanel(new GridLayout(4,3)); 
      getContentPane().add(panel); 
       
      JLabel label1=new JLabel("Player 1 Name"); 
      JLabel label2=new JLabel("Player 2 Name"); 
      //JLabel label3 = new JLabel("Yut1"); 
      //JLabel label4 = new JLabel("Yut2"); 
       
      player1Tf=new JTextField(10); 
      player2Tf=new JTextField(10); 
      yut1Tf = new JTextField(10); 
      yut2Tf = new JTextField(10);

      b1=new JButton("Start Game"); 
      b2=new JButton("Clear");
      b3=new JButton("Set");
      //b4=new JButton("Clear");

      b1.addActionListener(this); 
      b2.addActionListener(this); 
      b3.addActionListener(this);       
	   //b4.addActionListener(this);

      panel.add(label1); 
      panel.add(label2); 
      //panel.add(label3);
      //panel.add(label4);  
      panel.add(player1Tf); 
      panel.add(player2Tf); 
      panel.add(yut1Tf);
      panel.add(yut2Tf); 
      panel.add(b1); 
      panel.add(b2);
      panel.setSize(300, 400);
   } 
    
   public void actionPerformed(ActionEvent e) { 
      JButton b = (JButton)e.getSource(); 
      if (b == b1) { 
            b1.setText("Click clear button -->");
            String name1 = player1Tf.getText(); 
            String name2 = player2Tf.getText();
            YutGame game=new YutGame(name1,name2);
            game.play();
            player1Tf.setText (player1Tf.getText()); 
            player2Tf.setText (player2Tf.getText());
            yut1Tf.setText(String.valueOf(game.getP1().getYut()));
            yut2Tf.setText(String.valueOf(game.getP2().getYut()));  
         } 
       
      else if (b == b2) { 
         player1Tf.setText(""); 
         player2Tf.setText(""); 
         //yut1Tf.setText(""); 
        // yut2Tf.setText(""); 
         b1.setText("Replay"); 
    
       }
 //      else if (b == b3){
         
 //      }
   } 
    
   public static void main(String[] args) { 
      YutGUI gui = new YutGUI(); 
      gui.setDefaultCloseOperation(EXIT_ON_CLOSE); 
      gui.pack(); 
      gui.setVisible(true); 
   } 
} 
