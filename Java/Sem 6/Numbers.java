import java.applet.*;
import java.awt.*;
/*
<applet code="Numbers.class" width=300 height=300>
</applet> 
*/

public class Numbers extends Applet
{
	public void paint(Graphics g)
	{
	   try
	   {
		for(int i = 1; i <= 10; i ++)
		{
			g.drawString(String.valueOf(i), 100, 100 + (i * 15));
			Thread.sleep(100);
		}
	   }
	   catch(InterruptedException e)
	   {
		System.out.println(e);
	   }
	}
}