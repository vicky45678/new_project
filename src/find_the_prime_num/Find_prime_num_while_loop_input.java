package find_the_prime_num;

import java.util.Scanner;

public class Find_prime_num_while_loop_input {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num");
        int num=sc.nextInt();

        int i=2;
        boolean flag=false;

        while (i<=num/2){
            if (num%i==0){
                flag=true;
                break;
            }
            i++;
        }
        if (!flag){
            System.out.println("it is a prime num");
        }
        else
            System.out.println("its not a prime num");
    }
}
