import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class changePanel extends Applet implements ActionListener
{
     Frame F1;
     Button B1;
     Label L1,L2;
     Panel  P1,P2;
    public void init()
   {
       F1=new Frame("Presentation");
       B1=new Button("click");
       L1=new Label("1st PANEL");
       L2=new Label("2nd PANEL");
       P1=new Panel();
        P2=new Panel();
 
        F1.setSize(500,500);
        F1.setBackground(Color.pink);
        F1.setLayout(new FlowLayout());
        F1.add(B1);
        P1.setSize(200,200);
        F1.add(P1);
        P1.add(L1);
        F1.setVisible(true);
 
      B1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
   {
        if(ae.getSource()==B1)
        {
           P1.setVisible(false);
            F1.add(P2);
            P2.add(L2);
        }
    }
}

