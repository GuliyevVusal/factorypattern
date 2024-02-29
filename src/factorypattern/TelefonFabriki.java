package factorypattern;

public class TelefonFabriki {
    // getTelefon metodunu miye Static olsun dedik ? Cunki Dillerler Telefon yaratmasin
    // TelefonFabriki uzerinden direkt olaraq static getTelefon metodunu Cagiracaq diller.Meqsedimiz
    // Obyekt yaratmaq ishini Fabrikaya vermekdirki Dillerle (wordTelecom) Telefon arasindaki Elaqeni
    // Minumuma ENDIREK..Interfaceden istifade ederek musteriye yaratma mentiqini gostermeden obyekt yaradiriq
    // 100-lerle Telefon modeli olsa nece olacaq her model ucun else if else if yazsaq kodumuz uzancaq 
    // Bu qarisiqligin qarshisini almaq ucun Abstract Factory Pattern Yaradilmisdir
    public static Telefon getTelefon(String Model, String Battery, int hight, int length) {

        Telefon telefon;
        if ("S8".equalsIgnoreCase(Model)) {
            telefon = new S8(Model, Battery, hight, length);
        } else if ("Note9".equalsIgnoreCase(Model)) {
            telefon = new Note9(Model, Battery, hight, length);
        } else {
            throw new RuntimeException("Dogru Model Deyil..!!!");
        }
        return telefon;
   
    }
}
