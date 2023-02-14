package pl.camp.it.java10;

import java.util.List;
import java.util.stream.Collectors;

public class NiemutowalnyCollector {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7);

        List<String> newList = list.stream()
                .map(i -> i + "_STRING")
                .collect(Collectors.toUnmodifiableList());

        //newList.add("123123");
        System.out.println(newList);
    }
}
