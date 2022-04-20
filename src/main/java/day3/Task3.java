package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            double number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            double devision;
            switch (number2) {
                case 0:
                    System.out.println("Деление на 0");
                    continue;
                default:
                    devision = number1 / number2;
                    System.out.println(devision);
            }

        }

    }
}
