package find_the_prime_num;

public class Find_prime_while_loop_1 {
    public static void main(String[] args) {

        int num=2, i=2;
        boolean flag=false;

        while (i<=num/2){
            if(num%i==0){
                flag=true;
                break;
            }
            i++;
        }
        if (!flag){
            System.out.println(num+" =it is a prime num");
        }
        else
            System.out.println(num+ "=its not a prime num");
    }
}
