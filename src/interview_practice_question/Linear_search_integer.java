package interview_practice_question;

public class Linear_search_integer {
    public static void main(String[] args) {
        // find the index position
        int[] arr ={5,3,6,1,4,2};
        int item=4;

        for (int i=0; i<arr.length; i++){
            if (arr[i]==item){
                System.out.println("item is present at"+i+"index position");
            }
        }


        // Q= jab item na ho use print krane ke liye

        int[] arry ={5,3,6,1,4,2};
        int items =  19;
        int temp =0;
        for(int i=0; i<arry.length; i++){

            if(arry[i]==items){
                System.out.println("item is present at"+i+"index position");
                temp=temp+1;
            }
        }
        if (temp == 0){
            System.out.println("item not found in list");
        }
    }
}
