package ascending_order_program;

public class Ascending_order_num_4 {
    public static void main(String[] args) {

        int [] arr=new int[]{5,1,6,3,8,2};
        int temp=0;

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]>arr[j]){

                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]+"");
        }

    }
}
