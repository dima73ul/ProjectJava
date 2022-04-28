package day8;

public class Task1 {
    public static void main(String[] args) {
        String string = new String("");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            string = string + i + " ";
        }
        System.out.println(string);
        long stop = System.currentTimeMillis();
        System.out.println("Время работы класса String " + (stop - start) + " мс");

        StringBuilder stringBuilder = new StringBuilder("");
        start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            stringBuilder.append(i).append(" ");
        }
        System.out.println(string);
        stop = System.currentTimeMillis();
        System.out.println("Время работы класса StringBuilder " + (stop - start) + " мс");
    }
}
