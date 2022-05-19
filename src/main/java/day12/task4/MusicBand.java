package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public static void transferMembers(MusicBand groupA, MusicBand groupB) {
        for (String A : groupA.getMembers()) {
            groupB.getMembers().add(A);
        }

        groupA.getMembers().clear();
    }

    public static void printMembers(MusicBand members) {
        for (String member : members.getMembers()) {
            System.out.println(member);
        }

        if(members.getMembers().size() == 0){
            System.out.println("Музыкальная группа " + members.getName() + " не содержит участников. ");
        }
    }
}
