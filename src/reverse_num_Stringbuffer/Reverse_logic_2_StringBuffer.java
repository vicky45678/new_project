package reverse_num_Stringbuffer;

import java.util.Scanner;

public class Reverse_logic_2_StringBuffer {
    public static void main(String[] args) {

        // rever the number using by string buffer
        // logic 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        StringBuffer sb= new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();

        System.out.println("Revers number is="+rev);

    }
}
