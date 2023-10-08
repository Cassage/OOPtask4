package Adapter;

public class SDCard {

    public void writeCardData() {
        System.out.println("SD-карта вставлена в кардридер");
        System.out.println("Данные sd-карты обновлены");
    }

    public void readCardData() {
        System.out.println("Данные sd-карты прочитаны");
        System.out.println("SD-карта извлечена из кардридера");
    }

}
