package pl.camp.it.java14;

public class RekordMain {
    public static void main(String[] args) {
        Rekord rekord = new Rekord("Janusz", "Kowalski", 50);
        System.out.println(rekord.name());
        System.out.println(rekord.surname());
        System.out.println(rekord.age());

        rekord.metoda();
    }
}
