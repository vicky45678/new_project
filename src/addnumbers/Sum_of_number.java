package addnumbers;

import java.util.Scanner;

public class Sum_of_number {
    //Q= can  you find out the sum of this number 89,87,65

    public static void main(String[] args) {
       int a, b, sum=0;
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of a:");
        a=sc.nextInt();
        System.out.println("enter the number of b:");
        b=sc.nextInt();

        sum=a+b;
        System.out.println("sum of the number is="+sum);
    }
}
