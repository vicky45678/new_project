package pattern_Question_practice_loops;

//Q4= Print the pattern(inverted half pyramid)
public class Pattern_Q4 {
    public static void main(String[] args) {
        int n=4;
        //outer loop
        //dicriment operator
        for (int i=n; i>=1; i--){
            //inner loop
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
