package find_the_prime_num;

import java.util.Scanner;

public class Find_prime_num_input {

    public static void main(String[] args) {

        //int num=29;
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();

        for (int i=2; i<=num/2; i++){
            if (num%i==0){
                flag=true;
                break;
            }
        }
        if (!flag){
            System.out.println(num+"is a prime num");
        }
        else
            System.out.println(num+"is not prime num");
    }
}
