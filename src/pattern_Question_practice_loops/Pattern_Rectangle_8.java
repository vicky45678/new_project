package pattern_Question_practice_loops;

public class Pattern_Rectangle_8 {
    public static void main(String[] args) {
        int a=4;
        int b=5;

        //outer
        for (int i=1; i<=a; i++){
            //inner
            for (int j=1; j<=b; j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
