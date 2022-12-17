package Reverse_String_program;

import java.util.Scanner;

public class Reverse_string_value_2 {
    public static void main(String[] args) {

        String str= "Vicky";
        String rev="";

        int lent=str.length();

        for (int i=lent-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("before the revers string +"+str);
        System.out.println("after the reverse string +"+rev);

        // using scanner class string
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the cahracter");
        String a= sc.nextLine();
        String b="";

        int c=a.length();
        for (int i=c-1; i>=0; i--){
            b=b+a.charAt(i);
        }
        System.out.println("after reverse string="+b);


        // using scanner class for String
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number");
        String d=s.nextLine();
        String e="";
        int len=d.length();
        for(int i=len-1; i>=0; i--){
            e=e+d.charAt(i);
        }
        System.out.println("After the reverse string"+e);


    }

}
