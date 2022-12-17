package interview_practice_question;

import java.util.Scanner;

// Palindrome is that number jiska reverse karke bhi same number ae ex 121
public class Palindrome_practice {
    public static void main(String[] args) {
       int no=122;
        int temp=no;
        int rev=0, rem;

        while (temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if (no==rev){
            System.out.println(no+"is Palindrome number ");
        }
        else{
            System.out.println(no+"is not a palindrome number");
        }

        // user se input leke check krna program
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int nu= s.nextInt();
        int temps=nu;
        int reverse=0, remember;

        while (temps!=0){
            remember=temps%10;
            reverse=reverse*10+remember;
            temps=temps/10;

        }
        if (nu==reverse){
            System.out.println(nu+"is Palindrom number");
        }
        else {
            System.out.println(nu+"is not palindrome number");
        }
    }
}
