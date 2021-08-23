import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class NewApplet extends Applet implements ActionListener
{          Label l1,l2;
           TextField t1,t2;
           Button b1,b2;
           public void init()
           {
                 l1=new Label("Fname");
                 l2=new Label("Lname");
                 t1=new TextField(15);
                 t2=new TextField(15);
                 b1=new Button("Submit");
                 b2=new Button("Cancel");
                 add(l1);
                 add(l2);
                 add(t1);
                 add(t2);
                 add(b1);
                 add(b2);
                 b1.addActionListener(this);
                  b2.addActionListener(this);
            }
           public void actionPerformed(ActionEvent a)
           {       Graphics g=getGraphics();
                if(a.getSource()==b1)
                {    
                
                  int t=Integer.parseInt(t1.getText());
                  int q=Integer.parseInt(t2.getText());
                  int c=t+q;
                  g.drawString(c+"",100,100);
                }
                else if(a.getSource()==b2)
                {
                    g.drawOval(200, 200, 300, 300);
                }
           }

           
}