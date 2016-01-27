package module8.flower;

public class Aster extends Flower {

    @Override
    public String getCurrentString(){

        return "Aster";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }
}