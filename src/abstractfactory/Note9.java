package abstractfactory;

public class Note9 implements Telefon{
    private String model;
    private String battery;
    private int length;
    private int hight;

    public Note9(String model, String battery, int length, int hight) {
        this.model = model;
        this.battery = battery;
        this.length = length;
        this.hight = hight;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBattery() {
        return battery;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getHight() {
        return hight;
    }

    @Override
    public String toString() {
        return "Note9{" +
                "model='" + model + '\'' +
                ", battery='" + battery + '\'' +
                ", length=" + length +
                ", hight=" + hight +
                '}';
    }
}
