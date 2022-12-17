package Loops_practice;

import java.util.Scanner;

public class Do_while_loop {
    public static void main(String[] args) {
        int i=0;
        do{
            System.out.println(i);
            i=i+1;
        }
        while (i<11);

        //false condition
        int a=12;
        do{
            System.out.println("hello world");//in this condition it print only one time it is false condition
            a=a+1;
        }
        while (a<11);

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
