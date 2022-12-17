package reverse_num_algoritham;

public class Reverse_num_algoritham_5 {

    public static void main(String[] args) {

        int num=12345;
        System.out.println(num);

        int rev=0;
        while (num!=0){
            rev=rev*10+num%10;
            num=num/10;

            System.out.println("After revers number="+rev);
        }
        System.out.println("after reverse number= "+rev);
    }
}
