package DietelChapter6;

import java.util.Scanner;

public class BeautifyingStrings {

    public static String checkIfStringIsTerminatedByFullStop(String str) {
        if (str.contains(".")) return "Yes, " + str + " ends with '.'";
        return str + ".";
    }
    /*
     public static String checkIfStringStartsWithCapitalLetter(String str) {

     }*/

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = input.next();

        System.out.println(checkIfStringIsTerminatedByFullStop(word));
    }
}
