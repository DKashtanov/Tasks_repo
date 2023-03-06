package tasks.Task3.Singleton;

public class Singleton {

    private static Singleton instance;
    public String textForCheck;

    private Singleton(String textForCheck){
        this.textForCheck = textForCheck;
    }

    public static Singleton getInstance(String textForCheck){
        if (instance == null){
            instance = new Singleton(textForCheck);
        }
        return instance;
    }
}