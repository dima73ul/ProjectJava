package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List <String> list = new ArrayList<>(Arrays.asList("Audi", "BMW", "Lada", "Tesla", "Renault"));

        for(String l : list){
            System.out.println(l);
        }
        
        list.add(list.size()/2,"Opel");
        list.remove(0);

        System.out.println("list = " + list);

    }
}
