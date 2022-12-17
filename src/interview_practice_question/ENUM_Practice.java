package interview_practice_question;

/*
 * created an enumeration called cards
 *  with four enumerators.
 */
enum month
{
    jan,feb,mar,april
}

public class ENUM_Practice {
    /*
     *  stored each of the enumerators in the
     *  reference variables a1,a2,a3,a4 respectively.
     *  note that the new keyword was not used here
     */
    public static void main(String[] args) {

        month a1= month.jan;
        month a2= month.feb;
        month a3= month.mar;
        month a4= month.april;

        System.out.println("Enumerator are;" +a1+","+a2+","+a3+","+a4);
    }
}
