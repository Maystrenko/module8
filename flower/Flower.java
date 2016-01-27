package module8.flower;

public abstract class Flower {

    public String getCurrentString(){

        return "Flower";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }
}
