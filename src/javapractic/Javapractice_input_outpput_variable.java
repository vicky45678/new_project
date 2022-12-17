package javapractic;

import java.util.Scanner;

public class Javapractice_input_outpput_variable {
    public static void main(String args[]) {
        //for output
        // use print
        System.out.println("use of print");
        System.out.print("*");
        System.out.print("**");
        System.out.print("***");
        System.out.print("****");

        //use println
        System.out.println("use of println");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");

        //Use \n
        System.out.println("use of \n");
        System.out.println("*\n**\n***\n****");

        //for calculation
        System.out.println("practice of calculation");
        int a = 10;
        int b = 65;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        double div = a / b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

        //for input
        //there are multifunction like
        //nextint()
        //nextfloat()
        //nextdouble()
        //nextString()
        System.out.println("this input print only first word");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);

        System.out.println("all line print input function");
        Scanner scanner = new Scanner(System.in);
        String post = scanner.nextLine();
        System.out.println(post);

//q1 take to variable 'c' & 'b' and print their sum make a scanner class
        Scanner scanner1 = new Scanner(System.in);
        int c = scanner1.nextInt();
        int d = scanner1.nextInt();
        int e = c + d;
        System.out.println(e);

    }
}