package array_program;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        //using array
        String emplo[]=new String[3];
        emplo[0]="vicky";
        emplo[1]="vaibhav";
        emplo[2]="rani";
        for (int i=0; i<3; i++){
            System.out.println(emplo[i]);
        }


        Scanner sc=new Scanner(System.in);
        String size=sc.nextLine();
       // String[] emplo1=new String[size];


    }
}