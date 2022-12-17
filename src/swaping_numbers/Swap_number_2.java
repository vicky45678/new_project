package swaping_numbers;

public class Swap_number_2
{
    //swap 4 number without using third variable
    public static void main(String[] args)
    {

        int a=10;
        int b=20;
        int c=30;
        int d=40;

        System.out.println("Before swaping \na="+a+"\nb="+b+"\nc="+c+"\nd="+d);

        a=a+b+c+d;
        b=a-b-c-d;
        c=a-b-c-d;
        d=a-b-c-d;
        a=a-b-c-d;

        System.out.println("after swaping num: a"+a);
        System.out.println("after swaping num: b"+b);
        System.out.println("after swaping num: c"+c);
        System.out.println("after swaping num: d"+d);
    }
}
