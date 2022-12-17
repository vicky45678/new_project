package if_else_and_else_if_practice;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class if_else_practic {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        if (a==b){
            System.out.println("equal");
        }
        else if (a>b){
            System.out.println("greater than this");
        }
        else {
            System.out.println("unless is lesser than this");
        }

        //module
        Scanner c=new Scanner(System.in);
        int d=c.nextInt();
        if(d % 2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }


        //Q1 if 3 is even number print buzinga
        int e=sc.nextInt();
        if(3%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("buzinga");
        }
    }
}
