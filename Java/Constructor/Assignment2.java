import java.util.*;

class Deposit {
    double principle;
    double period;
    double rate_of_interest;

    Deposit() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principle amount : ");
        this.principle = in.nextDouble();
        System.out.print("Enter the period (in years) : ");
        this.period = in.nextDouble();
        System.out.print("Enter the rate of interest : ");
        this.rate_of_interest = in.nextDouble();
    }

    Deposit(int principle, int period, int rate_of_interest) {
        this.principle = principle;
        this.period = period;
        this.rate_of_interest = rate_of_interest;
    }

    Deposit(double principle, double period) {
        this.principle = principle;
        this.period = period;
        this.rate_of_interest = 2.4;
    }

    double calculate_si() {
        return (this.principle * this.period * this.rate_of_interest) / 100.0;
    }
}

public class Assignment2 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        {
            Deposit dep = new Deposit();
            System.out.println("Q1. The simple interest is : " + dep.calculate_si());
        }
        {
            System.out.println("Q2.");
            System.out.print("Enter the principle amount : ");
            int principle = in.nextInt();
            System.out.print("Enter the period (in years) : ");
            int period = in.nextInt();
            System.out.print("Enter the rate of interest : ");
            int rate_of_interest = in.nextInt();
            Deposit dep = new Deposit(principle, period, rate_of_interest);

            System.out.println("The simple interest is : " + dep.calculate_si());
        }
        {
            System.out.println("Q2.");
            System.out.print("Enter the principle amount : ");
            int principle = in.nextInt();
            System.out.print("Enter the period (in years) : ");
            int period = in.nextInt();
            Deposit dep = new Deposit(principle, period);

            System.out.println("Q1. The simple interest is : " + dep.calculate_si());
        }
    }
}
