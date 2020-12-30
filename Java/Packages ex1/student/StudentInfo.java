package student;
import java.util.*;

public class StudentInfo {
    int id;
    String firstName;
    String lastName;

    public StudentInfo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student's ID : ");
        this.id = in.nextInt();

        System.out.print("Enter Student's First Name : ");
        this.firstName = in.next();

        System.out.print("Enter Student's Last Name : ");
        this.lastName = in.next();
    }

    public void display() {
        System.out.println("ID : " + this.id);
        System.out.println("First Name : " + this.firstName);
        System.out.println("Last Name : " + this.lastName);

    }
}
