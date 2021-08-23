// Demonstrate check box group/RadioButton 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class CBGroup extends Applet implements ItemListener
{
	String msg = "";
	Checkbox C1, C2, C3, C4;
	CheckboxGroup R1;
	public void init() 
	{
		R1 = new CheckboxGroup();

	C1 = new Checkbox("Dancing", R1, true);
	C2 = new Checkbox("Singing", R1, true);
	C3 = new Checkbox("Playing", R1, false);
	C4 = new Checkbox("Sitting", R1, false);
   
 	add(C1);
	add(C2);
	add(C3);
	add(C4);
 
       C1.addItemListener(this);
       C2.addItemListener(this);
       C3.addItemListener(this);
       C4.addItemListener(this);
	}
    public void itemStateChanged(ItemEvent ae)
    {
      repaint();
    }     
    public void paint(Graphics g) 
    {
           msg = "Current state: ";
	   g.drawString(msg, 6, 80);
	   msg = " Playing: " + c1.getState();
	   g.drawString(msg, 6, 100);
	   msg = " Singing: " + c2.getState();
	   g.drawString(msg, 6, 120);
	  msg = " Dancing: " + c3.getState();
	  g.drawString(msg, 6, 140);
	 msg = " Chatting: " + c4.getState();
	 g.drawString(msg, 6, 160);
     }
}