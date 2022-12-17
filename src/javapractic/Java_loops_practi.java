package javapractic;


import java.util.Scanner;

// for loop, while loop, do while loop practice
public class Java_loops_practi {
    public static void main(String args[]){
        //For loop
        /* syntex== for(int i=0; i<11; i++){
           }*/
        for(int counter= 0; counter<100; counter=counter+1){
            System.out.println("hello world");
        }

        //Q 1= print the num from 0 to 10
        for(int counter=0; counter<10; counter++){
        System.out.println(counter);
    }

    // while loop practice
        /*syntex== int i= 0;
                   while(i<11){
         */
        int i=0;
        while(i<11){
            System.out.println(i);
            i=i+1;
        }

        //do while loop practice true condition9
        /*syntex== do{
                     println(i);
                     }
                    while(i<11); */
        int e=0;
        do{
            System.out.println(e);
            e=e+1;
        }
        while(e<11);

        //check in false condition
        int f=12;
        do{
            System.out.println("apna college");
            f=f+1;
        }
        while (f<11);

    //Q 1= print the sum num of natural nums
        Scanner sc=new Scanner(System.in);
        int g=sc.nextInt();
        int sum=0;
        for(int v=0; v<=g; v++){
            sum=sum+v;
        }
        System.out.println(sum);

        //Q2= print the table of a number input by the user
        Scanner n=new Scanner(System.in);
        int o=n.nextInt();
        for(int p=1; p<11; p++ ){
            System.out.println(p*o);
        }

}
}
