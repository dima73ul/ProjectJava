package day4;


import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int maxSum = 0;
        int indexFistSum = 0;
        int sum;
        for (int i = 0; i < array.length - 2; i++) {
            firstNumber = array[i];
            secondNumber = array[i + 1];
            thirdNumber = array[i + 2];
            sum = firstNumber + secondNumber + thirdNumber;
            if(sum > maxSum){
                maxSum = sum;
                indexFistSum = i;
            }
        }
        System.out.println("maxSum = " + maxSum);
        System.out.println("indexFistSum = " + indexFistSum);
    }
}
