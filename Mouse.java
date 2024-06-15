package Listener; import java.awt.Frame; import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.MouseEvent; import java.awt.event.MouseListener;
public class Mouse implements MouseListener { TextArea s;
public Mouse()
{
Frame d=new Frame("kkkk"); s=new TextArea("");
d.add(s); s.addMouseListener(this); d.setSize(190, 190);
d.show();
}
public void mousePressed(MouseEvent e) { System.out.println("MousePressed");
int a=e.getX(); int b=e.getY();
System.out.println("X="+a+"Y="+b);
}
public void mouseReleased(MouseEvent e) { System.out.println("MouseReleased");
}
public void mouseEntered(MouseEvent e) { System.out.println("MouseEntered");
}
public void mouseExited(MouseEvent e) { System.out.println("MouseExited");
}
public void mouseClicked(MouseEvent e) { System.out.println("MouseClicked");
}
public static void main(String arg[])
{
Mouse a=new Mouse();
}
}