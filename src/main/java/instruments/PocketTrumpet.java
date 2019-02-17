package instruments;

import Interface.ISell;

public class PocketTrumpet extends Trumpet implements ISell {

    private double buyPrice;
    private double sellPrice;

    public PocketTrumpet(String materials, String colour, InstrumentType instrumentType, int numberOfValves, double buyPrice, double sellPrice) {
        super(materials, colour, instrumentType, numberOfValves);
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
