package java_sem_6;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class A6Q1 extends Applet implements ItemListener,ActionListener {
    double res;
    Label label1,label2;
    TextField txt1,txt2;
    Choice c;
    Button btn;
    
    public void init()  {
        label1 = new Label("Enter 2 numbers : ",Label.RIGHT);
        label2 = new Label("Choose an operation : ",Label.RIGHT);
        
        txt1 = new TextField(8);
        txt2 = new TextField(8);
        
        btn = new Button("Submit");
                
        c = new Choice();
        
        add(label1);
        add(txt1);
        add(txt2);
        
        add(label2);
        c.add("Choice");
        c.add("Addition");
        c.add("Subtract");
        c.add("Multiply");
        c.add("Division");
        add(c);
        add(btn);
        
        c.addItemListener(this);
        btn.addActionListener(this);
    }
    
    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }
    
    public void actionPerformed(ActionEvent a) {
        Graphics g1 = getGraphics();
        
        Double v1 = new Double(txt1.getText());
        Double v2 = new Double(txt2.getText());

        if(v1>0 && v2>0){
            if(c.getSelectedItem() == "Addition") {
                res = v1 + v2;
                repaint();
            }

            else if(c.getSelectedItem() == "Subtract") {
                res = v1 - v2;
                repaint();
            }

            else if(c.getSelectedItem() == "Multiply") {
                res = v1 * v2;
                repaint();
            }

            else if(c.getSelectedItem() == "Division") {
                res = v1 / v2;
                repaint();
            }
            else {
                g1.drawString("Please select Operation", 100, 120);
            }
        }
        else {
            g1.drawString("Enter Positive numbers only", 100, 140);
        }
    }
    
    public void paint(Graphics g) {
        g.drawString("The Answer is : "+ res + " ", 100, 100);
    }
}