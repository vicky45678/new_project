package Loops_practice;

import java.util.Scanner;

public class Table {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();  // this is input
                            //int a=2; //the is output
        for(int i=1; i<11; i++){
            System.out.println(i*a);
        }
    }
}
