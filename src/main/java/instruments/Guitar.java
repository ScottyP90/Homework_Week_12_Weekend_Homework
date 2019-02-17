package instruments;

import Interface.IPlay;

public abstract class Guitar extends Instruments implements IPlay {

    private GuitarType guitarType;
    private int numberOfStrings;

    public Guitar(String materials, String colour, InstrumentType instrumentType, GuitarType guitarType, int numberOfStrings) {
        super(materials, colour, instrumentType);
        this.guitarType = guitarType;
        this.numberOfStrings = numberOfStrings;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "Rocking out on the Guitar";
    }
}
