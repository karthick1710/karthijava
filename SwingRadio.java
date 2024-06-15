import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingRadio
{
   public static void main(String args[])
     {
       Abc obj=new Abc();
     }
}

class Abc extends JFrame implements ActionListener
{
  JLabel l1,l2,l3,l4;
  JTextField t1,t2;
  JButton b;
  JRadioButton r1,r2,r3;

  public Abc()
   {
     setLayout(new FlowLayout());

     l1=new JLabel("Name:");
     t1=new JTextField(25); 
     
     l2=new JLabel("College:");
     t2=new JTextField(25);
     
     l3=new JLabel("Department:");

     r1=new JRadioButton("Computer Department");
     r2=new JRadioButton("Electronics Department");
     r3=new JRadioButton("IT Department");

     ButtonGroup bg=new ButtonGroup();
     bg.add(r1);
     bg.add(r2);
     bg.add(r3);

     b=new JButton("Submit");

     l4=new JLabel();
     
     add(l1);
     add(t1);
     add(l2);
     add(t2);
     add(l3);
     add(r1);
     add(r2);
     add(r3);
     add(b);
     add(l4);

     b.addActionListener(this);
          
     setVisible(true);
     setSize(350,400);

     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

 public void actionPerformed(ActionEvent ae)
  {
    String name=t1.getText();
    String college=t2.getText();
    String message;
   
    if(r1.isSelected())
     { 
       message="Welcome "+name+" To "+college+", "+r1.getText();
       l4.setText(message);
     }
    if(r2.isSelected())
     { 
       message="Welcome "+name+" To "+college+","+r2.getText();
       l4.setText(message);
     }
    if(r3.isSelected())
     { 
       message="Welcome "+name+" To "+college+","+r3.getText();
       l4.setText(message);
     }
    
  }


}