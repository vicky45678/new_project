package reverse_num_algoritham;

import java.util.Scanner;

public class Reverse_number_algoritham_3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();

        int rev=0;
        while (num!=0){
            rev=rev*10+num%10;
            num=num/10;

        }
        System.out.println("reverse num="+rev);
    }
}
