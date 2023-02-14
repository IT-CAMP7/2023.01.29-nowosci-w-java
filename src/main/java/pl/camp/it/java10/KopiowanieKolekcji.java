package pl.camp.it.java10;

import java.util.List;

public class KopiowanieKolekcji {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        System.out.println(list);
        List<Integer> copy = List.copyOf(list);
        System.out.println(copy);

        //copy.add(10);
    }
}
