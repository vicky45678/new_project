package swaping_numbers;

public class Swap_number_3 {

    // swap number using third variable
    public static void main(String[] args) {

        int a=10, b=20;
        System.out.println("before swaping \na"+a+"\nb"+b);
        int t;

        t=a;
        a=b;
        b=t;

        System.out.println("After swaping a"+a);
        System.out.println("after swaping b"+b);

    }
}
