
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class A3Q1 extends Applet implements ItemListener {
    Checkbox triangle;
    Checkbox rectangle;
    Checkbox oval;

    public void init() {
        triangle = new Checkbox("Triangle");
        rectangle = new Checkbox("Rectangle");
        oval = new Checkbox("Oval Shape");
        add(triangle);
        add(rectangle);
        add(oval);
        
        triangle.addItemListener(this);
        rectangle.addItemListener(this);
        oval.addItemListener(this);
    }

    public void paint(Graphics graphics) {

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Checkbox selected = (Checkbox)e.getItemSelectable();
        Graphics graphics = getGraphics();
        if(selected.getState()) {
            switch(selected.getLabel()) {
                case "Triangle":
                    graphics.drawPolygon(new int[] {80, 90, 100}, new int[] {150, 100, 150}, 3);
                    break;
                case "Rectangle":
                    graphics.drawPolygon(new int[] {150, 200, 200, 150}, new int[] {100, 100, 150, 150}, 4);
                    break;   
                case "Oval Shape":
                    graphics.drawOval(250, 100, 50, 50);
                    break;
            }
        }
    }

}
