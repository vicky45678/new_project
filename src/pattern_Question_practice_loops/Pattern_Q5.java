package pattern_Question_practice_loops;

//Q5=print the pattern(inverted half pyramid rotated by 180 deg)
public class Pattern_Q5 {
    public static void main(String[] args) {
        int n=4;
        //outer loop
        for (int i=1; i<=n; i++){
            //inner loop -> for space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
