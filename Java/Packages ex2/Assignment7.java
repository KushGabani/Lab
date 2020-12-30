import InsertStudName.Student;
import SortStudName.SortName;

public class Assignment7 {
    public static void main(String[]args) {
        Student std = new Student();
        SortName sortnames = new SortName();

        sortnames.sort(std.names);
    }
}
