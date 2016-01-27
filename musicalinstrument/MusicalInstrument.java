package module8.musicalinstrument;

public abstract class MusicalInstrument {

    public String getCurrentString(){
        return "Musical instrument";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }

}