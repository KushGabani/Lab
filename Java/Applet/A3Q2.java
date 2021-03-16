import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class A3Q2 extends Applet implements ActionListener {
    Label basic;
    Label da;
    Label hra;
    Label pf;
    Label final_salary;
    TextField BASIC;
    TextField DA;
    TextField HRA;
    TextField PF;
    Button btn;
    
    @Override
    public void init() {
        basic = new Label("Basic Salary : ");
        da = new Label("DA : ");
        hra = new Label("HRA: ");
        pf = new Label("PF : ");
        final_salary = new Label("");
        
        BASIC = new TextField(8);
        DA = new TextField(8);
        HRA = new TextField(8);
        PF = new TextField(8);
        
        btn = new Button("Calculate");
        
        add(basic);
        add(BASIC);
        add(da);
        add(DA);
        add(hra);
        add(HRA);
        add(pf);
        add(PF);
        add(final_salary);
        add(btn);
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        Graphics graphics = getGraphics();

        int b = Integer.parseInt(BASIC.getText());
        int d = Integer.parseInt(DA.getText());
        int h = Integer.parseInt(HRA.getText());
        int p = Integer.parseInt(PF.getText());
        
        
        if(a.getSource() == btn) {
            int f = b + d + h - p;
            basic.setText(f  + "Rs.");
        }
    }
}
