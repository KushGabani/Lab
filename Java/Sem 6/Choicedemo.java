import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="Choicedemo" width=250 height=200>
</applet>
*/

public class Choicedemo extends Applet implements ItemListener
{

       Choice c1;
 
       public void init()
       {
           c1=new Choice();
           c1.add("python");
           c1.add("java");
           c1.add("jsp/servlet");
           c1.add(".net");

           add(c1);
           c1.addItemListener(this);
      }
      public void itemStateChanged(ItemEvent ae)
      {
          if(c1.getSelectedItem()=="python")
          {
               setBackground(Color.yellow);
          }
      }
}
