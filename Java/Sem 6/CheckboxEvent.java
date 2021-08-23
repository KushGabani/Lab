// Demonstrate check boxes.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="CheckboxEvent" width=250 height=200>
</applet>
*/
public class CheckboxEvent extends Applet implements ItemListener
{
	String msg = "";
	Checkbox c1, c2, c3, c4;
	public void init() 
	{
	c1 = new Checkbox("Playing", null, true);
	c2 = new Checkbox("Singing");
	c3 = new Checkbox("Dancing");
	c4 = new Checkbox("Chatting");
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
	}
public void itemStateChanged(ItemEvent ie) 
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