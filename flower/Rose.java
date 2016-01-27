package module8.flower;

public class Rose extends Flower {

    @Override
    public String getCurrentString(){

        return "Rose";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }
}
