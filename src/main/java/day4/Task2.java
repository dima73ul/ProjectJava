package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int zero = 0;
        int sumZero = 0;
        for(int number:array){
            if(number < min){
                min = number;
            }
            if(number > max){
                max = number;
            }
            if(number == 0){
                zero++;
            }
            if(number%10 == 0){
                sumZero += number;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("наименьший элемент массива " + min);
        System.out.println("наибольший элемент массива " + max);
        System.out.println("количество элементов массива, оканчивающихся на 0 " + zero);
        System.out.println("сумму элементов массива, оканчивающихся на 0 " + sumZero);

    }
}
