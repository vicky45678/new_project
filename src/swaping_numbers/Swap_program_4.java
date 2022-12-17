package swaping_numbers;

public class Swap_program_4 {
    public static void main(String[] args) {
        int a=40, b=80;
         //without using third variable
           a=a+b;
           b=a-b;
           a=a-b;
        System.out.println("after swap a="+a);
        System.out.println("after swap b="+b);

        //without using third variable logic 2
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("swap num a="+a);
        System.out.println("swap num b="+b);

        //using third variable
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println("after the swaping a==="+a);
        System.out.println("after the swap number b==="+b);



    }
}
