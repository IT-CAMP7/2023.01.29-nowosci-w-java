package pl.camp.it.java9;

public interface MetodyPrywatneWInterfejsach {

    void add(int a, int b);

    default int diff(int a, int b) {
        print(a);
        print(b);
        //
        //
        //
        //
        return a-b;
    }

    private void print(int a) {
        System.out.println(a);
    }
}
