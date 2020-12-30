package InsertStudName;
import java.util.*;

public class Student {
    public String[] names;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int n = in.nextInt();

        names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println(i + ". Name : ");
            names[i] = in.next();
        }
    }
}
