package pl.camp.it.java13;

public class BlokiTekstu {
    public static void main(String[] args) {
        String s = "Linijka 1\n" +
                "Linijka 2\n" +
                "Linijka 3\n" +
                "Linijka 4";

        String s2 = """
                Linijka 1
                Linijka 2
                Linijka 3
                Linijka 4
                """;

        System.out.println(s2);
    }
}
