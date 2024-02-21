package abstractfactory;

public interface TelefonFactory {

    Telefon getTelefon(String model,String battery,int lenght, int hight);
}
