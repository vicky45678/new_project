package interview_practice_question;

public class Linear_search_String {
    public static void main(String[] args) {
         String arr[]={"vicky","rohit","manish","ashish","vaibhav","king"};
         String item = "manish";
         for (int i=0; i< arr.length; i++){
             if (arr[i].equals(item)){
                 System.out.println("item present in the list"+i+"index position");
             }
         }


         // jab usme number na ho print krne ke liye "list is not found in the list"
         String arry[]={"vicky","rohit","manish","ashish","vaibhav","king"};
         String items="drigendra";
         int temp=0;
         for (int i=0; i< arry.length; i++){
             if (arry[i].equals(items)){
                 System.out.println("item present in"+i+"index position");
                 temp=temp+i;
             }

         }
         if (temp==0){
             System.out.println("item not present in the list");
         }
    }
}
