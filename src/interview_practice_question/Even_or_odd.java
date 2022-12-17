package interview_practice_question;


import java.util.Scanner;

// Q=1== Check is given number is even or odd
public class Even_or_odd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("enter the number:");
        num = input.nextInt();

        if (num%2 == 0)
            System.out.println("the enter number is even");
        else
            System.out.println("the enter number is odd");
        }

    }

