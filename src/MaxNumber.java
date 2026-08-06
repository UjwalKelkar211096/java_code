public class MaxNumber {

    public static void main(String[] args) {
        int arr[] = {15, 35, 155};
        System.out.println("Maximum of thrree Numbers is "+ MaxNumber.maxOfThree(arr));

    }

    public static int maxOfThree(int [] arr){
     int max = arr[0];

     if(arr[1]> max)
         max = arr[1];

     if(arr[2] > max)
         max = arr[2];
     return max;
    }
}
