import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;

class AgeException extends Exception {
    public AgeException() {
        super("Below 18, Invalid Age. ");
    }
}

public class Assignment10 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int age = 0;
        String name = "", address = "";
        try {
            System.out.println("Enter age : ");
            age = in.nextInt();
            System.out.println("Enter name : ");
            name = in.next();
            System.out.println("Enter address : ");
            address = in.next();

            if(age < 18) throw new AgeException();
            else System.out.println("Registration successfully done.");
        }
        catch (AgeException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Age : " + age);
            System.out.println("Name : " + name);
            System.out.println("Address : " + address);
        }
    }
}
