import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class A4Q1 extends Applet implements ActionListener{
    Choice languages;
    Choice names;
    Button display;
    Label msg;

    public void init() {
        languages = new Choice();
        names = new Choice();
        display = new Button("DISPLAY");
        msg = new Label("");

        languages.add("Java");
        languages.add("PHP");
        languages.add("Android");
        languages.add(".NET");

        names.add("Ramesh");
        names.add("Suresh");
        names.add("Dharmesh");
        names.add("Rakesh");

        add(languages);
        add(names);
        add(display);

        display.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        String language = languages.getItem(languages.getSelectedIndex());
        String name = names.getItem(names.getSelectedIndex());
        label.setText(name + " is enrolled in " + language + " subject");
    }
}
