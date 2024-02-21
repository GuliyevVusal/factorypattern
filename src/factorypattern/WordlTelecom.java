package factorypattern;

public class WordlTelecom {

    public static void main(String[] args) {

        Telefon s8 = TelefonFabriki.getTelefon("S8", "2600mah", 4, 7);
        Telefon note9 = TelefonFabriki.getTelefon("Note9", "3500mah", 5, 8);

        System.out.println("S8 ucun Telefon ozellikleri:");
        System.out.println(s8);

        System.out.println("Note9 ucun Telefon ozellikleri");
        System.out.println(note9);


    }
}
