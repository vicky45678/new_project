package swaping_numbers;

public class Swap_number_8 {

    public static void main(String[] args) {
        // without using third variable

        int a=10 , b= 20;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("after swaping number a="+a);
        System.out.println("after swaping number b="+b);
    }
}
