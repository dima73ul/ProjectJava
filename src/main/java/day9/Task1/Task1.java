package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("Student Oleg", "group 01");
        Teacher teacher = new Teacher("Teacher Bob", "rus");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();

    }
}
