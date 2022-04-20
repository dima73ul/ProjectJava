package day4;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numder = scanner.nextInt();

        Random random = new Random();
        int [] array = new int[numder];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        System.out.println("Введено число " + numder + ". Сгенерирован следующий массив:" );
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + array.length);

        int kolvo8 = 0;
        int kolvo1 = 0;
        int chet = 0;
        for(int number:array){
            if(number > 8){
                kolvo8 ++;
            }
            if(number == 1){
                kolvo1++;
            }
            if(number%2 == 0){
                chet++;
            }
        }
        System.out.println("Количество чисел больше 8: " + kolvo8);
        System.out.println("Количество чисел равных 1: " + kolvo1);
        System.out.println("Количество четных чисел: " + chet);
    }
}
