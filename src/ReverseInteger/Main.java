package ReverseInteger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int number:");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println(num);

        String number = String.valueOf(num);
        char[] digits = number.toCharArray();

        for (int i = 0; i < digits.length; i++) {

            for (int j = 0; j < digits.length - 1; j++) {
                char temp = digits[j + 1];
                if (digits[j] < digits[j + 1]) {
                    digits[j + 1] = digits[j];
                    digits[j] = temp;
                }
            }

        }

        int a = Integer.parseInt(String.valueOf(digits));
        System.out.println(a);
    }
}


