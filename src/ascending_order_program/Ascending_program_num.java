package ascending_order_program;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Ascending_program_num {

     public static void main(String[] args) {

         int[] arr=new int[]{5,2,8,3,9,4,6};
         int temp;

         for (int i=0; i<arr.length; i++){
             for (int j=i+1; j<arr.length; j++){
                 if (arr[i]>arr[j]){

                     temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;                 }
             }
         }
         for (int i=0; i<arr.length; i++){
             System.out.println(arr[i]+"");
         }

     }

}
