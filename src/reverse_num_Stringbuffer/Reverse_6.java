package reverse_num_Stringbuffer;

import java.util.Scanner;

public class Reverse_6 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();

        StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();

        System.out.println("reverse numbere ="+rev);
    }
}
