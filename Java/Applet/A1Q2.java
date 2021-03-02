
import java.applet.Applet;
import java.awt.Graphics;

public class A1Q2 extends Applet {
    public void paint(Graphics graphics) {
        graphics.drawRect(50, 50, 150, 100);
        graphics.drawOval(75, 50, 100, 100);
        int[] x = {125, 90, 160, 150};
        int[] y = {50, 135, 135, 100};
        graphics.drawPolygon(x, y, 3);
    }
}
