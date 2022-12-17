package pattern_Question_practice_loops;

public class Pattern_hollow_rectangle_2 {

    public static void main(String[] args) {
        int a=5, b=8;

        for (int i=1; i<=a; i++){
            for (int j=1; j<=b; j++){
                if (i==1 | j==1 | i==a | j==b){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
