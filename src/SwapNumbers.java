public class SwapNumbers {

    public static void main(String[] args) {

      SwapNumbers.swapTwoNumbersWithThird(40, 60);

      SwapNumbers.swapTwoNumbersWithoutThird(10, 20);
    }

    public static void swapTwoNumbersWithThird(int num1, int num2){
                                                    //40  60
        int swapper;
        swapper = num1; //40

        num1 = num2;//60

        num2 = swapper; //40

        System.out.println(" Value of num1 and num2 after interchanging num1: "+num1 +" ::"+" num2 :"+num2);

    }

    public static void swapTwoNumbersWithoutThird(int num1, int num2){
                                                    //10  20

        num1 = num1 + num2; //30

        num2 = num1 - num2; //10

        num1 = num1 - num2; //20

        System.out.println(" Value of num1 and num2 after interchanging num1: "+num1 +" ::"+" num2 :"+num2);

    }
}
