import java.awt.Color;
import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
//<applet code="STDrawingArea" width="500" height="500">
//</applet>
import javax.swing.JPanel;

public class STDrawingArea extends Applet implements MouseListener, MouseMotionListener {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    int xPressed,yPressed;
    int xReleased,yReleased;
    int xDragged,yDragged;
    public STDrawingArea()
    {
        setPreferredSize(new Dimension(1280, 700));
        setBounds(0, 0, 1280, 700);
        setBackground(Color.WHITE);
        addMouseListener(this);
        addMouseMotionListener(this);

    }



    @Override
    public void mouseDragged(MouseEvent arg0) {
        Graphics g = getGraphics();
        xDragged = xPressed;
        yDragged = yPressed;
        g.drawLine(xPressed, yPressed, arg0.getX(), arg0.getY());
        xDragged = arg0.getX();
        yDragged = arg0.getY();
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent arg0) {
        // TODO Auto-generated method stub
        xPressed = arg0.getX();
        yPressed = arg0.getY();
        System.out.println("xPressed: "+xPressed+" ,yPressed: "+yPressed);
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        // TODO Auto-generated method stub
        xReleased = arg0.getX();
        yReleased = arg0.getY();
        System.out.println("xReleased: "+xPressed+" ,yReleased: "+yPressed);
    }


}