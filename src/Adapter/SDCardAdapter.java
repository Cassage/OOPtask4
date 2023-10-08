package Adapter;

public class SDCardAdapter implements USB {

    private SDCard sdCard;

    public SDCardAdapter(SDCard sdCard){
        this.sdCard = sdCard;
    }

    @Override
    public void readData() {
sdCard.readCardData();
    }

    @Override
    public void writeData() {
sdCard.writeCardData();
    }
}
