package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double number1 = scanner.nextDouble();
            double number2 = scanner.nextDouble();
            if (number2 == 0) {
                break;
            } else {
                System.out.println(number1 / number2);
            }

        }

    }
}
