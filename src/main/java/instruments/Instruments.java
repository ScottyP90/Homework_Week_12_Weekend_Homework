package instruments;

public abstract class Instruments {

    private String materials;
    private String colour;
    private InstrumentType instrumentType;

    public Instruments(String materials, String colour, InstrumentType instrumentType) {
        this.materials = materials;
        this.colour = colour;
        this.instrumentType = instrumentType;
    }

    public String getMaterials() {
        return materials;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
