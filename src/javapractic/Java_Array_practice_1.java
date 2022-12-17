package javapractic;

import javax.swing.*;
import java.util.Scanner;

public class Java_Array_practice_1 {
    public static void main(String[] args) {
        // array difine  1 first trick
        //array syntex= type[] arrayname=new type[];
        int[] marks=new int[3];
       // int marks[]=new int[3];  //it is also valid
        marks[0]=97;//phy
        marks[1]=98;//chem
        marks[2]=99;//engli
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        for (int i=0; i<3; i++){
            System.out.println(marks[i]);
        }

        //array difine 2 trick
        int number[]={97,98, 95};
        for (int i=0; i<3; i++){
            System.out.println(number[i]);
        }

        //Q=user se ek input leke hame ek array banana hai
        Scanner sc=new Scanner(System.in);//input
        int size=sc.nextInt();
        int num[]=new int[size];//arrray difine
        //inner loop
        for (int i=0; i<size; i++){
            num[i]=sc.nextInt();
        }
        //output loop
        for(int i=0; i<size; i++){
            System.out.println(num[i]);
        }

        /*Q 1= take a number as input from the user. search for a given
         number x and print the index at which it occurs.*/
        Scanner i=new Scanner(System.in);
        int size1=i.nextInt();
        int n[]=new int[size1];
        //input
        for (int j=0; j<size1; j++){
            n[j]=i.nextInt();
        }
        int x=i.nextInt();
        //output4
        for (int j=0; j<n.length; j++){
            if (n[j]==x){
                System.out.println("x found at index:"+j);
            }
        }




    }
}
