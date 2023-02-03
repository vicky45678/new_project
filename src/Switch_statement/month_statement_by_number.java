package Switch_statement;

import java.util.Scanner;

public class month_statement_by_number {

    public static void main(String[] args) {

        int a;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter NUmber here");
        a=sc.nextInt();

        switch (a){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Febuary");
                break;
            case 3:
                System.out.println("march");
                break;

            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            case 13:
                System.out.println("invalid input");
                break;
        }
    }
}
