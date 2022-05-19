package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> groupA = new ArrayList<>();
        groupA.add(new MusicArtist("A.A", 2000));
        groupA.add(new MusicArtist("B.B", 2001));
        groupA.add(new MusicArtist("C.C", 2002));

        List<MusicArtist> groupB = new ArrayList<>();
        groupB.add(new MusicArtist("D.D", 2005));
        groupB.add(new MusicArtist("E.E", 2007));
        groupB.add(new MusicArtist("F.F", 2009));

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
