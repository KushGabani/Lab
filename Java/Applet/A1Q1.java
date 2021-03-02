
import java.applet.Applet;
import java.awt.Graphics;

public class A1Q1 extends Applet {
    public void paint(Graphics graphics) {
        graphics.drawLine(50, 50, 50, 100);
        graphics.drawLine(50, 100, 150, 100);
        graphics.drawLine(150, 100, 150, 150);
        graphics.drawLine(50, 150, 100, 150);
        graphics.drawLine(100, 150, 100, 50);
        graphics.drawLine(100, 50, 150, 50);
        graphics.fillOval(72, 70, 5, 5);
        graphics.fillOval(72+50, 70, 5, 5);
        graphics.fillOval(72, 70+50, 5, 5);
        graphics.fillOval(72+50, 70+50, 5, 5);
    }
}
