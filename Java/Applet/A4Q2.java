import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class A4Q2 extends Applet implements ActionListener{
    List values;
    List stack;
    Button push;
    Button pop;

    public void init() {
        values = new List();
        stack = new List();
        push = new Button("PUSH");
        pop = new Button("POP");

        values.add("8");
        values.add("2");
        values.add("7");
        values.add("1");
        values.add("0");

        add(values);
        add(push);
        add(pop);
        add(stack);

        push.addActionListener(this);
        pop.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent a) {
        if(e.getSource() == push) {
            for(String ele:values.getSelectedIndex()) {
                stack.add(values.getItem(ele));
            }
        }
        if(e.getSource() == pop) {
            String[] elements = stack.getItems();
            String rm = elements[elements.length - 1];
            values.add(rm);
            stack.remove(rm);
        }
    }
}
