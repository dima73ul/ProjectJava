package day11.task1;

public class Courier implements Worker{
    private int salary;
    private boolean isPayed;
    public Warehouse warehouse;

    @Override
    public String toString() {
        return "заработная плата = " + salary +
                ", был выплачен бонус = " + isPayed;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);

    }

    @Override
    public void bonus() {

        if(warehouse.getCountDeliveredOrders() < 10_000){
            System.out.println("Бонус пока не доступен");
            return;
        }

        if(isPayed){
            System.out.println("Бонус уже был выплачен ");
            return;
        }

        salary += 50_000;
        isPayed = true;

    }
}
