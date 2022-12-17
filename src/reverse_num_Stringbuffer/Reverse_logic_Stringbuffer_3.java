package reverse_num_Stringbuffer;

import java.util.Scanner;

public class Reverse_logic_Stringbuffer_3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();

        StringBuffer Sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=Sb.reverse();

        System.out.println("Reverse num="+rev);
    }
}
