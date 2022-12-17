package Find_even_and_odd_num;

import java.util.Scanner;

public class fine_even_odd_6 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int num=sc.nextInt();

        if (num%2==0){
            System.out.println("is even num");
        }
        else
            System.out.println("is a odd num");
    }
}
