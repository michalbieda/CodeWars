package CountingDuplicates;


import java.util.Arrays;
import java.util.Scanner;

public class CountDuplicates {
    // Brzeczyszczykiewicz - powinno zwrócić  1(z)+1(e)+1(c)+1(y)+1(i)=5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words to count duplicated letters: ");
        String text = scanner.nextLine();
        System.out.println();
        System.out.println("\nNumber of dupicated letters: " + duplicateCount(text));

    }

    public static int duplicateCount(String text) {

        int counter = 0;
        text = text.toLowerCase();
        char[] charArray = text.toCharArray();
        System.out.println("Number of chcarcters in a given string: " + text + " is " + charArray.length);

        for (int i = 0; i < charArray.length; i++) {
//            System.out.println("---- Checking letter no: " + (i + 1));
            if (charArray[i] == '0') {
//                System.out.println("Skipped - Already checked letter");
                continue;
            }

//            System.out.println(Arrays.toString(charArray));
            int subcount = 1;

            for (int j = i + 1; j < charArray.length; j++) {
//                System.out.print("Iteration j: " + (j + 1) + " -> Checking for letter: " + charArray[i]);
//                System.out.println("Letter in given position: " + charArray[j]);

                if (charArray[i] == charArray[j] && charArray[j] != '0') {
//                    System.out.println(" --> MATCH!! Found letter: " + charArray[i] + " position " + (j + 1));
                    charArray[j] = '0';
                    subcount++;
//                    System.out.println("Subcount value: " + subcount);
                }
//                else {
//                    System.out.println(" --> Not matched!");
//                }
            }

            if (subcount > 1) {
                counter++;
//                System.out.println("Increase!! -->> Duplicated letters counter value: " + counter);
            }


        }

        return counter;
    }
}
// Brzeczyszczykiewicz -> 5
