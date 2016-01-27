package module8.file;

public abstract class File {

    public String getCurrentString(){
        return "File";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }
}
