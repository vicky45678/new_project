package ascending_order_program;

public class Acsending_order_program_6 {
    public static void main(String[] args) {

        int arr[]=new int[]{76,23,4,24,76,45,98};
        int temp;

        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i]>arr[j]){
                 temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;

                }
            }
        }
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
