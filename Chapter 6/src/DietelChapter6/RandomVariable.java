package DietelChapter6;

import java.util.Random;
public class RandomVariable {

    public static int randomNumbersA(){
        // 2 ≤ n ≤ 6
        Random picks = new Random();
        return picks.nextInt(2, 7);
    }
    public static int randomNumbersB(){
        // 4 ≤ n ≤ 50
        Random picks = new Random();
        return picks.nextInt(4, 51);
    }
    public static int randomNumbersC(){
        // 0 ≤ n ≤ 7
        Random picks = new Random();
        return picks.nextInt(0, 8);
    }
    public static int randomNumbersD(){
        // 1000 ≤ n ≤ 1030
        Random picks = new Random();
        return picks.nextInt(1000, 1031);
    }
    public static int randomNumbersE(){
        // –5 ≤ n ≤ 1
        Random picks = new Random();
        return picks.nextInt(-5, 2);
    }
    public static int randomNumbersF(){
        // –2 ≤ n ≤ 9
        Random picks = new Random();
        return picks.nextInt(-2, 10);
    }

}
