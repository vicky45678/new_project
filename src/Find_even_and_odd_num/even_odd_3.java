package Find_even_and_odd_num;

import java.util.Scanner;

public class even_odd_3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();

        if (num%2==0){
            System.out.println("enter the number is even");
        }
        else
            System.out.println("enter number is odd");
    }
}
