package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Мерседес");
        car.setColor("Красный");
        car.setYear(2000);

        System.out.println("Информация об авто :");
        System.out.println("модель = " + car.getModel());
        System.out.println("цвет = " + car.getColor());
        System.out.println("год выпуска = " + car.getYear());
    }
}

class Car {
    private String model;
    private String color;
    private int year;

    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}