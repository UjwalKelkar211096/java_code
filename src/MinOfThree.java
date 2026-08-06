public class MinOfThree {

    public static void main(String[] args) {

        int [] arr = {5, 25, 665};
        System.out.println("Min of three Numbers is "+MinOfThree.minOfThreeNumbers(arr));

    }

    public static int minOfThreeNumbers(int [] arr){
        int min = arr[0];

        if(arr[1] < min)
            min = arr[1];

        if(arr[2] < min)
            min = arr[2];

        return min;
    }
}
