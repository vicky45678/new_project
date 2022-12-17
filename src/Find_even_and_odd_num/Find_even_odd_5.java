package Find_even_and_odd_num;

import java.util.Scanner;

public class Find_even_odd_5 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();

        //int num=56;

        if( num%2==0){
            System.out.println("the number is even");
        }
        else
            System.out.println("the number is odd");
    }
}
