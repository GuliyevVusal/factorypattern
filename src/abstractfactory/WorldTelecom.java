package abstractfactory;

public class WorldTelecom {
    public static void main(String[] args) {

        // Magzalar Yalniz fabrikleri ve interfaceleri gorecek metodlar static olmadigina gore
        // Fabriklerin Objectini Ozumuz yaratmaliyiq mecburi ve sonra bundan telefon vermeyini istedik
        S8Fabriki s8Fabriki = new S8Fabriki();
        Telefon s8 = s8Fabriki.getTelefon("s8", "2600mah", 6, 8);



        System.out.println(s8);
    }
}
