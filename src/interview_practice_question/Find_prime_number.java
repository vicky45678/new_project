package interview_practice_question;

public class Find_prime_number {
    public static void main(String[] args) {
        int i, m=0, flag=0;
        int n=6;
        m=n/3;

        if(n==0 || n==1){
            System.out.println(n+"is not a prime number");
        }
        else {
            for (i=2; i<=m; i++){
                if (n % i == 0){
                    System.out.println(n+"is not a prime number");
                    flag=1;
                    break;
                }
            }
            if (flag == 0){
                System.out.println(n+"is a prime number");
            }

        }
    }
}
