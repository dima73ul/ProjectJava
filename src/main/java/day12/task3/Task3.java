package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> musicBandList = new ArrayList<MusicBand>();
        
        musicBandList.add(new MusicBand("A", 1990));
        musicBandList.add(new MusicBand("B", 1991));
        musicBandList.add(new MusicBand("C", 1992));
        musicBandList.add(new MusicBand("D", 1993));
        musicBandList.add(new MusicBand("E", 1994));
        musicBandList.add(new MusicBand("F", 1995));
        musicBandList.add(new MusicBand("G", 2000));
        musicBandList.add(new MusicBand("J", 2002));
        musicBandList.add(new MusicBand("K", 2003));
        musicBandList.add(new MusicBand("L", 2004));

        Collections.shuffle(musicBandList);

        printMusicBandList(musicBandList);
        System.out.println("----------------------------");
        printMusicBandList(groupsAfter2000(musicBandList));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){

        List<MusicBand> musicBandList = new ArrayList<MusicBand>();

        for(MusicBand list: bands){
            if(list.getYear() >= 2000){
                musicBandList.add(list);
            }
        }
        return musicBandList;
    }

    public static void printMusicBandList(List<MusicBand> bands){

        for (MusicBand list:bands){
            System.out.println(list.getName() + " " + list.getYear());
        }

    }
}
