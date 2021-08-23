import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class a1 extends Applet
{
    Button b1,b2;
    public void init()
    {
        setLayout(Null);
        b1=new Button("ok");
        b2=new Button("cancel");

        add(b1);
        b1.setBounds(50,50,100,100);
        add(b2);
        b2.setBounds(150,150,200,200);

     }
}         