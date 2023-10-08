import Adapter.SDCard;
import Adapter.SDCardAdapter;
import Adapter.USB;
import Adapter.USBStorage;

public class main {
    public static void main(String[] args) {
        USBStorage usbStorage = new USBStorage();

        usbStorage.readData();
        usbStorage.writeData();

        USB sdCard = new SDCardAdapter(new SDCard());

        sdCard.readData();
        sdCard.writeData();

    }
}
