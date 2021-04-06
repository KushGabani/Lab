import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class A5Q1 extends Applet implements ActionListener
{
    Label label;
    TextField text;
    Button btn;
    int vowels = 0, consonants = 0, digits = 0, spaces = 0;
    String vow="",cons="",dig="";
    
    public void init() 
    {
        label = new Label("String: ");
        text = new TextField(10);        
        btn = new Button("Click");
        
        add(label);
        add(text);
        add(btn);
        
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent a)
    {
        Graphics g = getGraphics();
        
        if(a.getSource() == btn)
        {
            String s = text.getText();
        
            s = s.toLowerCase();
            g.drawString("Lowercase: "+s+"", 500, 100);
            
            for(int i=0; i <= s.length(); i++)
            {
                char ch = s.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                {
                     ++vowels;
                     vow += ch; // Vowels in String
                }

                // check if character is in between a to z
                 if ((ch >= 'a' && ch <= 'z') && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
                {
                      ++consonants;
                      cons += ch; // Consonants in String
                }

                // check if character is in between 0 to 9
                if (ch >= '0' && ch <= '9') 
                {
                      ++digits;
                      dig += ch; // Digits in String
                }

                // check if character is a white space
                 if (ch == ' ') 
                {
                      ++spaces;
                      
                }
                 repaint();
            }
            
        }
    }
    
    public void paint(Graphics g1)
    {
        g1.drawString("Digits = " + digits + "", 500, 20);
        g1.drawString("Vowels = "+ vowels + "", 500, 40);
        g1.drawString("Consonants = " + consonants + "", 500, 60);
        g1.drawString("Spaces = " + spaces + "", 500, 80);
        g1.drawString("Vowels in string = "+ vow + "", 500, 100);
        g1.drawString("Consonants in string = "+ cons + "", 500, 120);
        g1.drawString("Digits in string = "+ dig + "", 500, 140);
    } 
}
