package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Opel");
        car.setColor("Green");
        car.setYear(2010);
        car.info();
        System.out.println("количество лет " + car.yearDifference(2022));

        Motorbike motorbike = new Motorbike("BMW", "red", 2000);
        motorbike.info();
        System.out.println("количество лет " + motorbike.yearDifference(2022));
    }
}
