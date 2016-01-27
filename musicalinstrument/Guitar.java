package module8.musicalinstrument;

public class Guitar extends MusicalInstrument {

    @Override
    public String getCurrentString(){
        return "Guitar";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }
}