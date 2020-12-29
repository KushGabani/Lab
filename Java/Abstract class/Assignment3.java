import com.sun.source.doctree.TextTree;

import java.util.*;

abstract class Stack {
    protected int size;
    protected int top;
    protected int[] stack;

    Stack(int size) {
        this.size = size;
        this.stack = new int[this.size];
        this.top = -1;
    }

    Stack() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the stack");
        this.size = in.nextInt();
        this.stack = new int[this.size];
        this.top = -1;
    }

    abstract public void push();
    abstract public void pop();
    abstract public void display();
}

class Test extends Stack {
    Test() {
        super();
    }

    Test(int size) {
        super(size);
    }

    public void push() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value to push to the stack : ");
        int val = in.nextInt();
        if(this.top != size)
            this.stack[++top] = val;
        else
            System.out.println("Stack Overflow.");
    }

    public void pop() {
        if(this.top != -1)
            System.out.println("Removed the value : " + this.stack[top--]);
        else
            System.out.println("Stack Underflow.");
    }

    public void display() {
        for(int i = 0; i < this.top; i++)
            System.out.print(this.stack[i] + ", ");
    }
}

public class Assignment3 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        Test test = new Test(in.nextInt());
        test.push();
        test.push();
        test.push();
        test.display();
        test.pop();
        test.display();
    }
}
