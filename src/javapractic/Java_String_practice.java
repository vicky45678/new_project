package javapractic;

import java.util.Scanner;

//String is non primitive data
/*String are immutable "ek bar memory ke andar koi string banadi to use ham change ni kar skte"
 (na usme ham koi add kr skte na change kr skte or na hi delet kr skte)isme ham koi changes ni kr skte  agr hame string main koi chnages karne hai to hame ek new string banani pdegi*/
public class Java_String_practice {
    //String declaration
   /* String name="tony";
    String fullname="tony Stark";
    String sentence="my name is tony stark";*/
    public static void main(String[] args) {

        // user se string ko input lena hai to
        //Agar hame puri ki puri line print krni hogi to hame nextline ka use krna hai
       Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("your name is "+name);


        // 1 =concatenation= (matlb do string ko jodna) = manlo hamne first name liya fir last name hmara kam ise full name
        // bnana hai in do String ko jjod kar
        String firstname = "tony";
        String lastname = "Stark";
        String fullname = firstname +" "+ lastname;// "" direct space dene ke liye
        System.out.println(fullname);

        //2= length= ham kisi bhi string ki length ko ham function ki form m calculate kar skte hai
        String firstname1 = "tony";
        String lastname1 = "Stark";
        String fullname1 = firstname +" "+ lastname;// "" direct space dene ke liye
        //iski length print ho jaegi
        System.out.println(fullname.length());

        //man lijiye ki string ke sare charecter ko print karna hai to ek ek krke print karana hai
        //charAt ka use karenge
        for (int i=0; i<fullname1.length(); i++){
            System.out.println(fullname1.charAt(i));

        }
        //
        //doNO string ko compare karna hai mtlb= ky nAME 1 Kya NAME 2 compare hai
        //1=cpmpare
        String name1="aony";
        String name2="tony";
        if (name1.compareTo(name2)==0){
            System.out.println("String are equale");
        }
        else {
            System.out.println("string are not equale");
        }
        //2=(==) ye bahut sare case main fail ho jata hai isliye ham compare ka use krte hai
        String name3="tony";
        String name4="tony";
        if (name3==name4){
            System.out.println("String are equale");
        }
        else {
            System.out.println("string are not equale");
        }

        //subString= kisi bi bade part ka chota part nikalna
        String sentence="my name is tony"; // jiase ki hame isme jo name hai tony wo nikalna wo sab string hoti hai
        String name5=sentence.substring(11,sentence.length());// isme start or ending pont lete hai
        System.out.println(name5);

        String sentence1="tonystark";
        String name6=sentence1.substring(4);// sirf start point lete hai
        System.out.println(name6);

    }
}
