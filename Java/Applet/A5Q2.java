import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class A5Q2 extends Applet  implements ActionListener
{
    Button btn1,btn2,btn3;
    List list;
    
    public void init() 
    {
        btn1 = new Button("Oval");
        btn2 = new Button("Ractangle");
        btn3 = new Button("Triangle");
        
        list = new List(4,false);
        
        list.add("Gray");
        list.add("Green");
        list.add("Black");
        list.add("Cyan");
       
        add(btn1);
        add(btn2);
        add(btn3);
        add(list);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        list.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent a)
    {
        Graphics g = getGraphics();
        
         if(a.getSource()==btn1)
         {
            if(list.getSelectedIndex() == 0)
            {
               g.setColor(Color.GRAY);
               g.drawOval(100, 100, 300, 150);
               g.fillOval(100, 100, 300, 150);
            }
             else if(list.getSelectedIndex() == 1)
             {
               g.setColor(Color.GREEN);
               g.drawOval(100, 100, 300, 150);
               g.fillOval(100, 100, 300, 150);
             }
             else if(list.getSelectedIndex() == 2)
             {
               g.setColor(Color.BLACK);
               g.drawOval(100, 100, 300, 150);
               g.fillOval(100, 100, 300, 150);
             }
             else if(list.getSelectedIndex() == 3)
             {
               g.setColor(Color.CYAN);
               g.drawOval(100, 100, 300, 150);
               g.fillOval(100, 100, 300, 150);
             }
         }
         else if(a.getSource()== btn2)
        {
            if(list.getSelectedIndex() == 0)
            {
               g.setColor(Color.GRAY);
               g.drawRect(500, 100, 300, 150);
               g.fillRect(500, 100, 300, 150);
            }
             else if(list.getSelectedIndex() == 1)
             {
               g.setColor(Color.GREEN);
               g.drawRect(500, 100, 300, 150);
               g.fillRect(500, 100, 300, 150);
             }
             else if(list.getSelectedIndex() == 2)
             {
               g.setColor(Color.BLACK);
               g.drawRect(500, 100, 300, 150);
               g.fillRect(500, 100, 300, 150);
             }
             else if(list.getSelectedIndex() == 3)
             {
               g.setColor(Color.CYAN);
               g.drawRect(500, 100, 300, 150);
               g.fillRect(500, 100, 300, 150);
             }
        }
         else if(a.getSource()== btn3)
        {
            if(list.getSelectedIndex() == 0)
            {
               g.setColor(Color.GRAY);
               int xPoints[] = {1000, 1100, 900};
               int yPoints[] = {100, 200, 200};

               g.drawPolygon(xPoints, yPoints, 3);
               g.fillPolygon(xPoints, yPoints, 3);
            }
             else if(list.getSelectedIndex() == 1)
             {
               g.setColor(Color.GREEN);
               int xPoints[] = {1000, 1100, 900};
               int yPoints[] = {100, 200, 200};

               g.drawPolygon(xPoints, yPoints, 3);
               g.fillPolygon(xPoints, yPoints, 3);
             }
             else if(list.getSelectedIndex() == 2)
             {
               g.setColor(Color.BLACK);
               int xPoints[] = {1000, 1100, 900};
               int yPoints[] = {100, 200, 200};

               g.drawPolygon(xPoints, yPoints, 3);
               g.fillPolygon(xPoints, yPoints, 3);
             }
             else if(list.getSelectedIndex() == 3)
             {
               g.setColor(Color.CYAN);
               int xPoints[] = {1000, 1100, 900};
               int yPoints[] = {100, 200, 200};

               g.drawPolygon(xPoints, yPoints, 3);
               g.fillPolygon(xPoints, yPoints, 3);
             }
        }
    }
    
    public void paint(Graphics g)
    {
        
    }
}
