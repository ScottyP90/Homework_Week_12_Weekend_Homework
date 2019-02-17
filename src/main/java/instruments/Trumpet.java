package instruments;

import Interface.IPlay;

public abstract class Trumpet extends Instruments implements IPlay {

    private int numberOfValves;

    public Trumpet(String materials, String colour, InstrumentType instrumentType, int numberOfValves) {
        super(materials, colour, instrumentType);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play() {
        return "Blow a tune on the Trumpet";
    }
}
