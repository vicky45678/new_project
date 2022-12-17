package Find_even_and_odd_num;

import java.util.Scanner;

public class find_even_odd_4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();

        if (num%2==0){
            System.out.println("Enter num is even");
        }
        else
            System.out.println("enter number is odd");
    }
}
