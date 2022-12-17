package swaping_numbers;

public class Swap_program_5 {

    public static void main(String[] args) {

        int a=10,b=20, t;
        //using third variable.
        t=a;
        a=b;
        b=t;

        System.out.println("print a value after swaping="+a);
        System.out.println("print b value after swaping="+b);


        //without using third variable.

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("print a value a="+a);
        System.out.println("print b value b="+b);


    }
}
