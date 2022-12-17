package swaping_numbers;

public class Swap_number {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("after swap \na="+a+"\nb="+b);
        //System.out.println("swap b="+b);
    }
}
