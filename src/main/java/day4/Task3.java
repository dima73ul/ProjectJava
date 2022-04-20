package day4;


import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrice = new int[12][8];

        for (int i = 0; i < matrice.length ; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = random.nextInt(50);
            }
        }
        int sum = 0;
        int indexLine = 0;
        int maxNumber = 0;
        for (int i = 0; i < matrice.length ; i++) {

            for (int j = 0; j < matrice[i].length; j++) {
                sum += matrice[i][j];
                if(sum > maxNumber){
                    maxNumber = sum;
                    indexLine = i;
                }
                System.out.print(matrice[i][j] + " ");
            }
            System.out.print(" = " + sum);
            System.out.println();
            sum = 0;
        }
        System.out.println("Ответ : " + indexLine);
    }
}
