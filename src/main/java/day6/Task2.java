package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Россия", 2010, 50, 10000);
        airplane.setYear(2015);
        airplane.setLength(100);
        airplane.fillUp(200);
        airplane.fillUp(500);
        airplane.info();

    }
}
