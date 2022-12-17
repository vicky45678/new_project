package swaping_numbers;

public class Swap_number_6 {
    public static void main(String[] args) {

        int a=10, b=20;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("after swap a="+a);
        System.out.println("after swap num b="+b);
    }
}
