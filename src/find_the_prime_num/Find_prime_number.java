package find_the_prime_num;

import java.util.Scanner;

public class Find_prime_number {
    public static void main(String[] args) {

        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();

        for (int i=2; i<=num/2; i++){
            if (num%2==0){
                flag=true;
                break;
            }
        }
        if (!flag){
            System.out.println("is prime number");
        }
        else
            System.out.println("is prime not number");
    }
}
