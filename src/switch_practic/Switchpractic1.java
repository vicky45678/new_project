package switch_practic;

import java.util.Scanner;

public class Switchpractic1 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int button=sc.nextInt();
    switch (button){
        case 1 :
            System.out.println("hello");
            break;
        case 2 :
            System.out.println("welcome back");
             break;
        case 3 :
            System.out.println("home");
            break;
        case 4 :
            System.out.println("enter the room");
            break;
        case 5 :
            System.out.println("please stay in room");
            break;
        case 6 :
            System.out.println("exist");
            break;
        default:
            System.out.println("invalid");
    }

    }

}
