package find_the_prime_num;

public class prime_num_output_1 {

    public static void main(String[] args) {

        int num=43;
        boolean flag=false;

        for (int i=2; i<=num/2; i++){
            if (num%i==0){
                flag=true;
                break;
            }
        }
        if (!flag){
            System.out.println(num+"is a prime number");
        }
        else
            System.out.println(num+"is not a prime num");
    }
}
