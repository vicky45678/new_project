package reverse_num_algoritham;

import java.util.Scanner;

public class Reverse_num_usingScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        // using algoritham
        // int num=2345;
        int rev=0;
        while (num!=0)
        {
         rev=rev*10+num%10;
         num=num/10;
        }
        System.out.println("Reverse number is ="+rev);

        //using scanner for inter value
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number");
        int number=s.nextInt();
        int reverse=0;
        while (number!=0){
            reverse=reverse*10+number%10;
            number=number/10;
        }
        System.out.println("after the reverse number="+reverse);

        //using algorithem
        Scanner a=new Scanner(System.in);
        System.out.println("enter the number");
        int number1=a.nextInt();

        int reverse1=0;
        while (number1!=0) {
            reverse1 = reverse1 * 10 + number1 % 10;
            number1 = number1 / 10;
        }
        System.out.println("print reverse number"+reverse1);


        }
}
