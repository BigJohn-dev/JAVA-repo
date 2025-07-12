package anotherSnack;

public class OddArray {
    public static String oddNumbersIn(int[] numbers) {

        int displayOdd = numbers[0];
        for(int count = 0; count < numbers.length; count++){
            if(numbers[count] % 2 != 0) {
                displayOdd = numbers[count];
            }
        }
        return "This are the odd numbers in the array: " + displayOdd;
    }

    public static void main(String[] args){
        int[] a = {1, 3, 4, 5, 6,7 ,20};
        System.out.println(oddNumbersIn(a));
    }
}
