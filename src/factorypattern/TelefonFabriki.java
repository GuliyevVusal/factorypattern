package factorypattern;

public class TelefonFabriki {
    // getTelefon metodunu miye Static olsun dedik ? Cunki Dillerler Telefon yaratmasin
    // Fabriklerde yaratmasin Fabrika uzerinden direkt olaraq static metodu Cagiracaq diller.Meqsedimiz
    // Obyekt yaratmaq ishini Fabrikaya vermekdirki Dillerle (wordTelecom) Telefon arasindaki Elaqeni
    // Minumuma ENDIREK....
    // 100-lerle Telefon modeli olsa nece olacaq her model ucun else if else if yazsaq kodumuz pis goruneck
    // Bu qarisiqligin qarshisini almaq ucun Abstract Factory Pattern Yaradilmisdir
    public static Telefon getTelefon(String Model, String Battery, int Eni, int Uzunu) {

        Telefon telefon;
        if ("S8".equalsIgnoreCase(Model)) {
            telefon = new S8(Model, Battery, Eni, Uzunu);
        } else if ("Note9".equalsIgnoreCase(Model)) {
            telefon = new Note9(Model, Battery, Eni, Uzunu);
        } else {
            throw new RuntimeException("Dogru Model Deyil..!!!");
        }
        return telefon;
    //  TelefonFabriki getTelefon metodu istifade ederek bize verilen modele ait obyekti yaradir
    }
}
