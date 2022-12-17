package armstrong_number;

import java.util.Scanner;
// this program only work for 3 digit number12  
public class Armstrong_number2 {
    public static void main(String[] args) {

        int n, arm=0, rem, c;

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();

        c=n;
        while (n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if (c==arm){
            System.out.println("it is armstrong number");
        }
        else
            System.out.println("is not armstrong number");

    }
}