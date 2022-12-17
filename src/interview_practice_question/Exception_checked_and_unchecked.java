package interview_practice_question;


public class Exception_checked_and_unchecked {
    public static void main(String[] args) {
        try {
            int a = 100, b = 0, c;
            c = a / b;
        } catch (Exception e) {

            System.out.println(e);
        }
        System.out.println("hello world");
    }

}
