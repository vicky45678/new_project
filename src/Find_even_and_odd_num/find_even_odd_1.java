package Find_even_and_odd_num;

import java.util.Scanner;

public class find_even_odd_1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        if (num % 2==0){
            System.out.println("enter number is even");
        }
        else
            System.out.println("enter number is odd");
    }
}
