import java.util.*;
import java.util.stream.IntStream;

class Students {
    protected int[] exam_no;
    protected String[] student_name;
    protected int n;
    Students() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the total number of students : ");
        this.n = in.nextInt();

        this.exam_no = new int[this.n];
        this.student_name = new String[this.n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the exam no of the student : ");
            this.exam_no[i] = in.nextInt();
            System.out.print("Enter the name of the student : ");
            this.student_name[i] = in.next();
        }
    }
}

class Examination extends Students {
    int[] subject1;
    int[] subject2;
    int[] subject3;

    Examination() {
        Scanner in = new Scanner(System.in);
        this.subject1= new int[this.n];
        this.subject2= new int[this.n];
        this.subject3= new int[this.n];

        System.out.println("Enter the marks of subject 1 : ");
        for (int i = 0; i < n; i++) {
            System.out.print("Exam no. : " + exam_no[i] + "\tmarks: ");
            this.subject1[i] = in.nextInt();
        }

        System.out.println("Enter the marks of subject 2 : ");
        for (int i = 0; i < n; i++) {
            System.out.print("Exam no. : " + exam_no[i] + "\tmarks: ");
            this.subject2[i] = in.nextInt();
        }

        System.out.println("Enter the marks of subject 3 : ");
        for (int i = 0; i < n; i++) {
            System.out.print("Exam no. : " + exam_no[i] + "\tmarks: ");
            this.subject3[i] = in.nextInt();
        }
    }

    protected boolean is_pass() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the exam no of the student to see pass or fail : ");
        int exam_no = in.nextInt();

        int index = IntStream.range(0, n)
                .filter(i -> exam_no == this.exam_no[i])
                .findFirst()
                .orElse(-1);

        if(subject1[index] <= 28 || subject2[index] <= 28 || subject3[index] <= 28)
            return true;
        else
            return false;
    }
}

class Sports extends Students {
    protected boolean[] saptdhara;
    protected boolean[] nss;
    protected boolean[] ncc;

    Sports() {
        this.saptdhara = new boolean[this.n];
        this.nss = new boolean[this.n];
        this.ncc = new boolean[this.n];

        Scanner in = new Scanner(System.in);
        System.out.println("Is the student enrolled in any of the following? Saptdhara/NSS/NCC.");
        System.out.print("Enter 1. for saptdhara, 2. for NSS, 3. for NCC.");
        int choice = in.nextInt();
        for (int i = 0; i < this.n; i++) {
            switch (choice) {
                case 1 -> {
                    this.saptdhara[i] = true;
                    this.nss[i] = false;
                    this.ncc[i] = false;
                }
                case 2 -> {
                    this.saptdhara[i] = false;
                    this.nss[i] = true;
                    this.ncc[i] = false;
                }
                case 3 -> {
                    this.saptdhara[i] = false;
                    this.nss[i] = false;
                    this.ncc[i] = true;
                }
            }

        }
    }
}

class Results extends Sports, Examination {

}

public class Assignment5 {
}
