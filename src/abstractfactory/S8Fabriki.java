package abstractfactory;

public class S8Fabriki implements TelefonFactory{

//    Factory Patternde biz bir fabrik qurmusduq telefon modeline gore eger S8 idise s8
//    Note9 dursa Note9 istehsal et demisdik amma Fabrikde 100-lerle telefon modeli olsa
//      if ("S8".equalsIgnoreCase(Model)) {
//            telefon = new S8(Model, Battery, Eni, Uzunu);
//        } else if ("Note9".equalsIgnoreCase(Model)) {
//            telefon = new Note9(Model, Battery, Eni, Uzunu);
//    yazmaq mumkun deyil Burda Abstract Factory gelir Abstract ne edir ?
//    Telefon fabriki clasini da bolur S8 ucun ayri Fabrik Note9 ucun ayri fabrik yaradiriq
//    diger Modeller olarsa onlarada ayri Fabrik yaradiriq class olaraq ve implemenet edirik
//    TelefonFactoryni bu Bir interfacedir icerisinde getTelefon deye bir metod var parametirleri
//    (String model,String battery,int lenght, int hight)var ve Belelikle
//    Magazalar S8 istedikde s8 fabrikinden Note9 istedikde Note9 fabrikinden Isteyirler
    @Override
    public Telefon getTelefon(String model, String battery, int length, int hight) {
        return new S8(model,battery,length,hight);
        //Burada Bir S8 yaradiriq Eslinde implement etdikden sonra Null verir biz
//        Null evezine return new S8 deyirik ve parametirlerimizi otururuk
    }
}
