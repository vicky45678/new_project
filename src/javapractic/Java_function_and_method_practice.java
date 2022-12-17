package javapractic;
/* Q= what is deffrence between function and method
function= is take input and giving output and function call directly
method= we call method through by class of object(agr kisi point pr class ki object ki help se kar
rahe hai to usi same function ko ham method kahenge)*/

import java.util.Scanner;
// function is a stack memory area
// ex= ek book ke upar kai sari book
public class Java_function_and_method_practice {
    // it is function
    /*public static  void printMyName(String name){
        System.out.println(name);
        return;
    }
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printMyName(name);

    }*/
    //Q1= make a function to add 2 numbers and return the SUM
   /* public static int calculatesum(int a, int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        int b = i.nextInt();

        int sum = calculatesum(a, b);
        System.out.println("sum of 2 number is;"+sum);
    }*/


    //Q2= Make a function to multiply 2 numbers and return the product.
   /* public static int calculateproduct(int c, int d) {
        return c*d;
    }

    public static void main(String[] args) {
    Scanner j=new Scanner(System.in);
    int c=j.nextInt();
    int d=j.nextInt();
        System.out.println("product of 2 num is:"+calculateproduct(c,d));

    }*/

    //Find the factorial of a num
    // use loop concept
    public static void printfactorial(int n){
        if (n<0){
            System.out.println("invalid number");
            return;
        }
        //loop
        int factorial=1;
        for (int i=n; i>=1; i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int n= k.nextInt();
        printfactorial(n);
    }

}

