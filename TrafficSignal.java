import java.awt.*;
import java.applet.Applet;
/*
<applet code="TrafficSignal"width=600 height=500>
</applet>
*/
public class TrafficSignal extends Applet{
public void paint(Graphics g){
int n=4;
int x[]={160,160,300,300};
int y[]={20,450,450,20};
g.setColor(Color.black);
g.fillPolygon(x,y,n);
g.setColor(Color.red);
g.fillOval(180,50,100,100);
g.setColor(Color.yellow);
g.drawString("STOP",210,105);
g.setColor(Color.orange);
g.fillOval(180,175,100,100);
g.setColor(Color.white);
g.drawString("LISTEN",210,230);
g.setColor(Color.green);
g.drawOval(180,300,100,100);
g.fillOval(180,300,100,100);
g.setColor(Color.black);
g.drawString("PROCEED",200,355);
g.setColor(Color.black);
int a[]={225,225,250,250};
int b[]={450,575,575,450};
g.fillPolygon(a,b,n);
}
}
