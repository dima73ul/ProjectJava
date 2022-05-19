package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> groupA = new ArrayList<>();
        groupA.add("A.A");
        groupA.add("B.B");
        groupA.add("C.C");

        List<String> groupB = new ArrayList<>();
        groupB.add("D.D");
        groupB.add("F.F");
        groupB.add("G.G");

        MusicBand band1 = new MusicBand("Rammstein", 1990, groupA);
        MusicBand band2 = new MusicBand("Blue System", 2000, groupB);

        MusicBand.printMembers(band1);
        System.out.println("-------");
        MusicBand.printMembers(band2);
        System.out.println("-------");
        MusicBand.transferMembers(band1, band2);
        MusicBand.printMembers(band2);
        System.out.println("-------");
        MusicBand.printMembers(band1);

    }
}
