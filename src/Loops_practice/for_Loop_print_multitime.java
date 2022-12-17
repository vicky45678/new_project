package Loops_practice;

import java.util.Scanner;

public class for_Loop_print_multitime {
    public static void main(String args[]){
        for(int i=0; i<10; i++) {
            System.out.println("hello world");
        }


        //Q1= print the some num 0 to 10
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
        //Q1= print the some num of natural num
        Scanner sc= new Scanner(System.in);
        int b= sc.nextInt();
        int sum=0;
        for(int c=0; c<=b; c++){
            sum=sum+c;
        }
        System.out.println(sum);


    }
}
