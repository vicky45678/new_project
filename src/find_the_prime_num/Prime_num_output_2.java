package find_the_prime_num;

public class Prime_num_output_2 {
    public static void main(String[] args) {

        int num=6;
        boolean flag=false;

       for (int i=2; i<=num/2; i++){
           if (num%i==0){
               flag=true;
               break;
           }
       }
        if (!flag){
            System.out.println(num+"is a prime num");
        }
        else
            System.out.println(num+"is not prime num");
    }
}
