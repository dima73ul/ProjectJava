package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String sub;

    public void evaluate(Student student){
        int min = 2;
        int max = 5;
        String estimation = "";
        int rnd = rnd(min, max);

        switch (rnd) {
            case 2:
                estimation = "неудовлетворительно";
                break;
            case 3:
                estimation = "удовлетворительно";
                break;
            case 4:
                estimation = "хорошо";
                break;
            case 5:
                estimation = "отлично";
                break;
        }

        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName()
                + " по предмету " + this.sub + " на оценку " + estimation);
    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public Teacher(String name, String sub) {
        this.name = name;
        this.sub = sub;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return sub;
    }

    public void setSubject(String subject) {
        this.sub = subject;
    }
}
