package reverse_num_Stringbuffer;

import java.util.Scanner;

public class Stringbuffer_5_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num=sc.nextInt();

        StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();

        System.out.println("this is reverse number="+rev);
    }
}
