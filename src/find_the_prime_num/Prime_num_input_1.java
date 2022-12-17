package find_the_prime_num;

import java.util.Scanner;

public class Prime_num_input_1 {

    public static void main(String[] args) {

        boolean flag=false;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();

        for (int i=2; i<=num/2; i++){
            if (num%i==0){
                flag=true;
                break;
            }
        }
        if (!flag){
            System.out.println("is a prime number");
        }
        else
            System.out.println("is not a prime number");


    }
}
