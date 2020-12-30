package exam;
import javax.sound.midi.SysexMessage;
import java.util.*;

public class Result {
    int maths;
    int science;
    int english;
    int computer;

    public Result() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks for maths: ");
        this.maths = in.nextInt();
        System.out.println("Enter marks for science: ");
        this.science = in.nextInt();
        System.out.println("Enter marks for english: ");
        this.english = in.nextInt();
        System.out.println("Enter marks for computer : ");
        this.computer = in.nextInt();
    }

    public void display() {
        System.out.println("Maths : " + this.maths);
        System.out.println("Science : " + this.science);
        System.out.println("English : " + this.english);
        System.out.println("Computer : " + this.computer);
    }
}
