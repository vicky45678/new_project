package reverse_num_Stribuilder;

import java.util.Scanner;

public class Reverse_Stribuilder_2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num= sc.nextInt();

        StringBuilder sbl=new StringBuilder();
        sbl.append(num);
        StringBuilder rev=sbl.reverse();

        System.out.println("After the reverse order ="+rev);
    }
}
