package Reverse_String_program;

public class Reverse_string_value {

    public static void main(String[] args) {
        // using+ string concatnation operator

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        String str=sc.nextLine();*/

        String str= "ABCD";
        String rev="";

        int lent=str.length();
        for (int i=lent-1; i>=0; i--){
            rev=rev+str.charAt(i);

        }
        System.out.println("before the reverse string ="+str);
        System.out.println("After the Reverse string is ="+rev);
    }
}
