import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class A2Q1 extends Applet implements ActionListener {
    Label principle;
    Label rate;
    Label time;
    Label no_of_time_interest_applied;
    TextField p;
    TextField r;
    TextField t;
    TextField n;
    Button si;
    Button ci;
    
    public void init() {
        principle = new Label("Principle : ");
        rate = new Label("Rate : ");
        time = new Label("Time : ");
        no_of_time_interest_applied = new Label("no. of times interest applied");
        
        p = new TextField(8);
        r = new TextField(8);
        t = new TextField(8);
        n = new TextField(8);
        
        si = new Button("Calculate SI");
        ci = new Button("Calculate CI");
        
        add(principle);
        add(p);
        add(rate);
        add(r);
        add(time);
        add(t);
        add(no_of_time_interest_applied);
        add(n);
        add(si);
        add(ci);
        si.addActionListener(this);
        ci.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        Graphics graphics = getGraphics();
        
        int pr = Integer.parseInt(p.getText());
        int rt = Integer.parseInt(r.getText());
        int tm = Integer.parseInt(t.getText());
        int nt = Integer.parseInt(n.getText());
        
        if(a.getSource() == si ) {
            int simple_interest = pr * rt * tm;
            graphics.drawString(simple_interest + "", 100, 150);
        }
        else if(a.getSource() == ci ) {
            int compound_interest = (int) (pr * Math.pow(1 + (rt / nt), tm * nt));
            graphics.drawString(compound_interest + "", 200, 150);
        }
    }
}
