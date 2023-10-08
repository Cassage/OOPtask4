package Adapter;

public class USBStorage implements USB {

    @Override
    public void writeData() {
        System.out.println("Данные USB обновлены");
    }

    @Override
    public void readData() {
        System.out.println("Данные USB прочитаны");
    }
}
