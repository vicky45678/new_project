package javapractic;


//string builder ki help se kuch aisa hoga ki wo heap area main automatically update or chnge kr skte hai
//like delete,update, add, change,
public class Java_String_builder_practice_2 {
    public static void main(String[] args) {
        //Decalare
        StringBuilder sb=new StringBuilder("tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0    kisi char ko ham uski jagah set kr skte hai
        sb.setCharAt(0,'p');
        System.out.println(sb);

        //is tarh ham apni string builder main ham cheejo ko ham insert bi krskte hai
        //insert== iska use krke ham kisi starting main kisi bi alphabate(char) ko ham add kr sakte hai
        sb.insert(0,'s');
        System.out.println(sb);

        //trick 2
        sb.insert(2,'n');
        System.out.println(sb);

        //Delete the extra 'n' iska ham kisi bi cheej kop delete karne ke liye ham use krte hai
        sb.delete(2,3);
        System.out.println(sb);

        //iske alawa cheeje append bi kr skte hai mtlb uske end main ham cheeje jod kste hai
        sb.append("e");
        sb.append("y");
        System.out.println(sb);
        //.length function yaha bi kam krta hai agr hame uski hame end main length print krwani hoti hai
        System.out.println(sb.length());


        //Q 1= revers String like "tony" after rever "ynot"
        StringBuilder r=new StringBuilder("hello");
        for (int i=0; i<r.length()/2; i++) {
            int front = i;
            int back = r.length() - 1 - i;//5-1-0=>4

            char frontchar= r.charAt(front);
            char backchar=r.charAt(back);

            r.setCharAt(front,backchar);
            r.setCharAt(back,frontchar);

        }
        System.out.println(r);

    }
}
