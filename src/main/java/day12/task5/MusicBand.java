package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public static void transferMembers(MusicBand groupA, MusicBand groupB) {
        for (MusicArtist A : groupA.getMembers()) {
            groupB.getMembers().add(A);
        }

        groupA.getMembers().clear();
    }

    public static void printMembers(MusicBand members) {
        for (MusicArtist member : members.getMembers()) {
            System.out.println(member.nameArtist + " " + member.ageArtist);
        }

        if(members.getMembers().size() == 0){
            System.out.println("Музыкальная группа " + members.getName() + " не содержит участников. ");
        }
    }
}
