package reverse_num_Stribuilder;

import java.util.Scanner;

public class REvers_logic_3_StringBuilder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();

        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev=sbl.reverse();

        System.out.println("This is the revers number="+ rev);
    }
}
