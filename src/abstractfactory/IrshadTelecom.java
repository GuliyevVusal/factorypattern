package abstractfactory;

public class IrshadTelecom {
    public static void main(String[] args) {

        Note9Fabriki note9Fabriki = new Note9Fabriki();
        Telefon note9 = note9Fabriki.getTelefon("Note9", "3500mah", 7, 5);

        System.out.println(note9);

    }
}
