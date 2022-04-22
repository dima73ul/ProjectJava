package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Али");
        Teacher teacher = new Teacher("Bob", "математика");
        teacher.evaluate(student);
    }
}
