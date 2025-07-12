package anotherSnack;

public class evenArray {
    public static String evenNumbersIn(int[] numbers) {

        int displayEven= numbers[0];
        for(int count = 0; count < numbers.length; count++){
            if(numbers[count] % 2 != 0) {
                displayEven = numbers[count];
            }
        }
        return "This are the odd numbers in the array: " + displayEven;
    }

    public static void main(String[] args){
        int[] a = {1, 3, 4, 5, 6,7 ,20};
        System.out.println(evenNumbersIn(a));
    }
}
