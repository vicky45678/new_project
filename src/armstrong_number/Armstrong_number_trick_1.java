package armstrong_number;

import java.util.Scanner;

public class Armstrong_number_trick_1 {
    public static void main(String[] args) {

        int n=123, z, count=0;

       /* Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();*/

        z=n;
        while (z>0){
            count=count+1;
            z=z/10;
        }
        System.out.println("no of digit="+count);

    }
}
