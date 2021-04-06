import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class A5Q3 extends Applet implements MouseListener,MouseMotionListener  
{
    String message="";
 
    int x,y;
    
    public void init()
    {
        super.init();
        setSize(400,400);
        addMouseListener(this);
        addMouseMotionListener(this);
    }
 
    public void paint(Graphics g)
    {
        showStatus(message);
        g.fillRect(x, y, 10, 10);
        g.drawString("x: "+x+" Y:"+y, 20,20);
    }

    @Override
    public void mouseDragged(MouseEvent e) 
    {
        x=e.getX();
        y=e.getY();
        message="X="+x+"Y="+y;
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) 
    {
        x=e.getX();
        y=e.getY();

        repaint();
        message="X="+x+"Y="+y;
    }
}