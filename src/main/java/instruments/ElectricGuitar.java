package instruments;

import Interface.ISell;

public class ElectricGuitar extends Guitar implements ISell {

    private double buyPrice;
    private double sellPrice;

    public ElectricGuitar(String materials, String colour, InstrumentType instrumentType, GuitarType guitarType, int numberOfStrings, double buyPrice, double sellPrice) {
        super(materials, colour, instrumentType, guitarType, numberOfStrings);
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
