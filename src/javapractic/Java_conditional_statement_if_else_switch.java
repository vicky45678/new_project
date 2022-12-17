package javapractic;

import java.util.Scanner;

public class Java_conditional_statement_if_else_switch {
    public static void main(String[] args) {
        //1 Statement
       Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        //condition apply
        if(age>18){
            System.out.println("adult");
        }
        else {
            System.out.println("not adult");
        }
        //2 Statement
        //modulo %
        Scanner e=new Scanner(System.in);
        int a=e.nextInt();
        if (a % 2 == 0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }

        // Question solve
        //Q 1 user c,d
        // c=d  equal
        // c>d a is greter then
        // c<d a is lesser
        Scanner f=new Scanner(System.in);
        int c=f.nextInt();
        int d=f.nextInt();
       // if (c == d){
          //  System.out.println("equal");
        //}
       // else {
           // if(c>d){
            //System.out.println(" c is greter then d");
        //}
           // else {
             //   System.out.println("is a lesser");
           // }

       //Else if statement
        if (c==d) {
            System.out.println("Equal");
        }
        else if(c>d){
            System.out.println("c is grater");
    }
        else {
            System.out.println("c is lesser");
        }
    ////Q2 if 3 is an even number, print "bazinga"
        Scanner g=new Scanner(System.in);
        int i=g.nextInt();
        if (3%2==0) {
            System.out.println("Even");
        }
        else {
        System.out.println("Bazinga");
    }
        //j+k
        Scanner h=new Scanner(System.in);
        int j=h.nextInt();
        int k=h.nextInt();
        System.out.println(j+k);
        System.out.println(j*k);
        System.out.println(j-k);
        System.out.println(j/k);

        //button press if else program
        Scanner l=new Scanner(System.in);
        int button=l.nextInt();
        //which button you press
        if (button == 1){
            System.out.println("hello");
        }
        else if(button ==2){
            System.out.println("namaste");
        }
        else if (button ==3){
            System.out.println("Bonjour");
        }
        else {
            System.out.println("Invelid button");
        }

        // button in Switch program
        //Syntex==switch(variable){
        switch (button){
            case 1 :
                System.out.println("hello");
            break;
            case 2 :
                System.out.println("Namaste");
            break;
            case 3 :
                System.out.println("bonjour");
                break;
            default:
                System.out.println("invalid button");

        }

}
}
