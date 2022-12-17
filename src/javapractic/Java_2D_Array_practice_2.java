package javapractic;

import java.util.Scanner;

public class Java_2D_Array_practice_2 {
    public static void main(String[] args) {
        //2D array Declaration
        //   type[] arrayName=new type[rows][columns];
        //  example= int[][] number=new int[3][5];
       Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        //array Declaration
        // bar bar loop ko repeat karna nested loops khte hai
        //input
        int[][] number=new int[rows][columns];
        //rows
        for (int i=0; i<rows; i++){
            //columns
            for (int j=0; j<columns; j++){
                number[i][j]= sc.nextInt();
            }
        }
        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
