import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class A4Q3 extends Applet implements ActionListener{
    List values;
    List queue;
    Button enqueue;
    Button dequeue;

    public void init() {
        values = new List();
        queue = new List();
        enqueue = new Button("ENQUEUE");
        dequeue = new Button("DEQUEUE");

        values.add("8");
        values.add("2");
        values.add("7");
        values.add("1");
        values.add("0");

        add(values);
        add(enqueue);
        add(dequeue);
        add(queue);

        enqueue.addActionListener(this);
        dequeue.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent a) {
        if(e.getSource() == enqueue) {
            for(String ele:values.getSelectedIndex()) {
                stack.add(values.getItem(ele));
            }
        }
        if(e.getSource() == dequeue) {
            String rm = queue.getItems()[0];
            values.add(rm);
            queue.remove(rm);
        }
    }
}
