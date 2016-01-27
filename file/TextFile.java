package module8.file;

public class TextFile extends File {

    @Override
    public String getCurrentString(){
        return "TextFile";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }

}
