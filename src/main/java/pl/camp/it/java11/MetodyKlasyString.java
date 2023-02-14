package pl.camp.it.java11;

public class MetodyKlasyString {
    public static void main(String[] args) {
        String s = " ";

        System.out.println(s.isBlank());

        String string = "A\nB\nC\nD";
        System.out.println(string);

        string.lines().map(str -> "Linijka: " + str).forEach(System.out::println);

        String string2 = "cos";
        String repeat = string2.repeat(10);
        System.out.println(repeat);

        String string3 = " ABC ";
        System.out.println(string3.strip());
        System.out.println(string3.stripLeading());
        System.out.println(string3.stripTrailing());
    }
}
