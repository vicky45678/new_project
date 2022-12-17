package swaping_numbers;

public class Swap_program {
    public static void main(String[] args) {

        // normal swaping
        //Logic 1
        //using third variable
        int a=10, b=20;
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println("logic 1 a="+a);
        System.out.println("logic 1 b="+b);


        //Q= swap two number without using third variable
        // logic 2
        // we use + and - operator
        int c=10, d=20;
        c = c+d;
        d = c-d;
        c = c-d;
        System.out.println("logic 2 c="+c);
        System.out.println("logic 2 d="+d);


        // swaping number without using third variable
        // logic 3
        // we use * and / operator
        int e=10, f=20;
        e=e*f;
        f=e/f;
        e=e/f;
        System.out.println("logic 3 e="+e);
        System.out.println("logic 3 f="+f);


        //swaping number without using third variable
        //logic 4
        //using bitwise XOR ^ this xor value convert into binary formate
        int g=10, h=20;
        g=g^h;
        h=g^h;
        g=g^h;
        System.out.println("logic 4 g="+g);
        System.out.println("logic 4 i="+h);


        // without using third variable
        // logic 5
        // single line statement
        int i=10, j=20;
        j=i+j-(i=j);
        i=i+j-(i=j);
        System.out.println("logic 5 i="+i);
        System.out.println("logic 5 j="+j);


    }
}
