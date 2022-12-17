package ascending_order_program;

public class Ascending_order_num_2 {
    public static void main(String[] args) {

        int [] arr= new int[]{4,30,23,86,45,32};
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
        System.out.println("arenging in ascenging order number");
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]+"");
        }
    }
}
