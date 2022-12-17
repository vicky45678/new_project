package Reverse_String_program;

import java.util.Scanner;

public class Reverse_string_value_3 {
    public static void main(String[] args) {
        String str="tum mere ho";
        String rev="";
        int lent=str.length();

        for(int i=lent-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("after reverse string=" +rev);



        //take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();

        String reve="";
        int lenght=s.length();
        for (int i=lenght-1; i>=0; i--){
            reve=reve+s.charAt(i);
        }
        System.out.println("reverse string="+reve);
        System.out.println(""+reve);
    }
}
