package instruments;

import Interface.IPlay;

public abstract class Piano extends Instruments implements IPlay {

    private int numberOfKeys;

    public Piano(String materials, String colour, InstrumentType instrumentType, int numberOfKeys) {
        super(materials, colour, instrumentType);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play() {
        return "Played a melody on the piano";
    }
}
