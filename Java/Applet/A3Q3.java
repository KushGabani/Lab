import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class A3Q3 extends Applet implements ItemListener {
    CheckboxGroup cbg;
    Checkbox triangle;
    Checkbox rectangle;
    Checkbox oval;
    boolean cls;
    
    public void init() {
        cbg = new CheckboxGroup();
        triangle = new Checkbox("Triangle", cbg, false);
        rectangle = new Checkbox("Rectangle", cbg, false);
        oval = new Checkbox("Oval Shape", cbg, false);
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
