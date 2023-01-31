package pl.camp.it.java9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MetodyFabrykujaceDoKolekcji {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        List<Integer> mutableList = new ArrayList<>(list);
        System.out.println(list);

        mutableList.add(10);
        //list.add(7);

        Set<Integer> set = Set.of(1,2,3,4,5,6);
        System.out.println(set);

        //set.add(9);

        Map<Integer, String> map = Map.of(
                1, "V1",
                2, "V2",
                3, "V3");

        Map<Integer, String> map2 = Map.ofEntries(
                Map.entry(1, "V1"),
                Map.entry(2, "V2"),
                Map.entry(3, "V3"),
                Map.entry(4, "V4"),
                Map.entry(5, "V5"),
                Map.entry(6, "V6")
        );

        duzoArgumentow(1,2,4);
        duzoArgumentow(2,34,2,23,4,2,32,23,3,4);
        duzoArgumentow(2);
        duzoArgumentow();
    }

    public static void duzoArgumentow(int... liczby) {
        for(int i = 0; i < liczby.length; i++) {
            System.out.println(liczby[i]);
        }
    }
}
