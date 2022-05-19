package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        acceptsNumbers(0, 30, list);
        acceptsNumbers(300, 350, list);

        System.out.println("list = " + list);

    }

    static void acceptsNumbers(int firstNumber, int secondNumber, List<Integer> list) {

        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
    }
}
