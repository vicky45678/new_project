package Switch_statement;

import java.util.Scanner;

public class Month_statement_by_if_else {

    public static void main(String[] args) {

         int a;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number here");
        a=sc.nextInt();

        if (a==1){
            System.out.println("January");
        }
        else if (a==2){
            System.out.println("feb");
        }
        else if (a==3){
            System.out.println("March");
        }
        else if (a==4){
            System.out.println("april");
        }
        else if (a==5){
            System.out.println("May");
        }
        else if (a==6){
            System.out.println("june");
        }
        else if (a==7){
            System.out.println("July");
        }
        else if (a==8){
            System.out.println("Aug");
        }
        else if (a==9){
            System.out.println("Sep");
        }
        else if (a==10){
            System.out.println("Oct");
        }
        else if (a==11){
            System.out.println("Nov");
        }
        else if (a==12){
            System.out.println("Dec");
        }
        else if (a==13){
            System.out.println("Invalid input");
        }

    }
}
