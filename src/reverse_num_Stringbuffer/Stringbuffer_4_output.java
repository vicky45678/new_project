package reverse_num_Stringbuffer;

import java.util.Scanner;

public class Stringbuffer_4_output {
    public static void main(String[] args) {

        int a=12347;

        StringBuffer sb=new StringBuffer(String.valueOf(a));
        StringBuffer rev=sb.reverse();

        System.out.println("Reverse num="+rev);
    }
}
