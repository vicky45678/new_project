package javapractic;

import java.util.Scanner;

public class Bit_manipulation {
    public static void main(String[] args) {
        //get bit
        //get bit (kisi bi no ko pahchanne ke liye get bit ka use karenge)
        /* Q.1= get the 3rd bit (position=2)of a number n.(n=0101)
         */
        //0101
        int n=5;
        int pos=1;
        int bitmask=1<<pos;

        if ((bitmask & n)==0){
            System.out.println("bit was zero");
        }
        else {
            System.out.println("bit was one");
        }
        //set bit
        //0101
        int a=5;
        int bos=1;
        int pitmask=1<<bos;

        int newNumber=pitmask | a;
        System.out.println(newNumber);

        //Q=3=clear the 3rd bit (position =2) of a number n.(n=0101)
        //clear bit
       int b= 5;
       int cos=2;
       int citmask=1<<cos;
       int notbitmask=~(citmask);

       int newnumber=notbitmask & b;
        System.out.println(newnumber);

        //update bit
        //Q=4= update the 2nd bit (position =1) of a number n to 1.(n=0101)
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        //oper=1;  set oper=0; clear
        int c=5;
        int dop=1;

        int ditmask=1<<dop;
        if (oper == 1){
            //set
            int newNumbe=ditmask | c;
            System.out.println(newNumbe);
        }
        else {
            int newbitmask = ~(bitmask);
            int newNumbe = newbitmask & c;
            System.out.println(newNumbe);
        }
    }
}
