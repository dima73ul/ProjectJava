package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("USA", 2000,200,1000);
        Airplane airplane2 = new Airplane("USA", 2010,150,1500);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}