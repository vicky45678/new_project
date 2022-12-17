package pattern_Question_practice_loops;

//Q6=Print the pattern (half pyramid with number)
public class Pattern_Q6 {
    public static void main(String[] args) {
        int n=5;
        //outer loop
        for (int i=1; i<=n; i++){
            //inner loop
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
