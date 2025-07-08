package DietelChapter6;

import java.util.Random;

public class RandomNumberSets {

    public static int randomNumbersInSetOfMultiplesOfThree(){
        // odd numbers between 0 and 15(not inclusive)
        return (int) (Math.random() * 10) ;
    }

    public static int randomNumbersInSetOfMultiplesOfFour(){
        Random picks = new Random();
        int number = picks.nextInt(1, 35);
        if (number % 4 == 0) return number;
        else return  1;
    }
    public static void main(String[] args) {
        System.out.println(randomNumbersInSetOfMultiplesOfThree());
        System.out.println(randomNumbersInSetOfMultiplesOfFour());
    }
}
