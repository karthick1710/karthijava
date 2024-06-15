import java.awt.*;
import java.awt.event.*;
class AWTExample1 extends Frame implements ActionListener {
  TextField t1, t2, t3;
  Button b1,b2,b3,b4;

    public AWTExample1()
   {

        super("Calculator");
        Label l1, l2, l3;
      
        l1 = new Label("Enter a value:");
        l2 = new Label("Enter b value:");
        l3 = new Label("Answer");
        l1.setBounds(50, 100, 100, 30);
        l2.setBounds(50, 150, 100, 30);
        l3.setBounds(50, 200, 100, 30);

        t1 = new TextField();
        t1.setBounds(150, 100, 200, 30);
        t2 = new TextField();
        t2.setBounds(150, 150, 200, 30);
        t3 = new TextField();
        t3.setBounds(150, 200, 200, 30);
        b1 = new Button("Add");
        b1.setBounds(50, 250, 80, 30);
        b1.addActionListener(this);

        b2 = new Button("Sub");
        b2.setBounds(150, 250, 80, 30); 
        b2.addActionListener(this);

        b3 = new Button("Mul");
        b3.setBounds(50, 300, 80, 30);
        b3.addActionListener(this);
        b4 = new Button("Div");
        b4.addActionListener(this);           
        b4.setBounds(150, 300, 80, 30);

        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setSize(500, 500);
        
        setLayout(null);
        setVisible(true);
     }    
  public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        String s2 = t2.getText();
        if (e.getSource()==b1) {
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c = a + b;

            String result = String.valueOf(c);
            t3.setText(result);
        }  else if (e.getSource()==b2) {
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c = a - b;

            String result = String.valueOf(c);
            t3.setText(result);
        }
else if (e.getSource()==b3) {
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c = a * b;

            String result = String.valueOf(c);
            t3.setText(result);
        }
else if (e.getSource()==b4) {
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c = a / b;

            String result = String.valueOf(c);
            t3.setText(result);
        }
     }
}
public class AddSum
{
    public static void main(String args[]) {
        
        AWTExample1 ff = new AWTExample1();

    }

}
