package instruments;

import Interface.ISell;

public class GrandPiano extends Piano implements ISell{

    private double buyPrice;
    private double sellPrice;

    public GrandPiano(String materials, String colour, InstrumentType instrumentType, int numberOfKeys, double buyPrice, double sellPrice) {
        super(materials, colour, instrumentType, numberOfKeys);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double markUp() {
        return Math.round((this.sellPrice - this.buyPrice) * 100.0)/100.0;
    }
}
