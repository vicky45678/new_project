package reverse_num_algoritham;

import java.util.Scanner;

public class Reverse_number_1_algorithom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();

        int rev=0;
        while (num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("Reverse num= "+rev);

        Scanner a=new Scanner(System.in);
        System.out.println("enter the value");
        String str=a.nextLine();

        String b="";
        int len=str.length();
        for (int i=len-1; i>=0; i--){
            b=b+str.charAt(i);
        }
        System.out.println("reverse string="+b);

    }
}
