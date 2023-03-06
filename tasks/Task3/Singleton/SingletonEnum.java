package tasks.Task3.Singleton;

public enum SingletonEnum {

    INSTANCE;
    private String textForCheck;

    public String getTextForCheck(){
        return textForCheck;
    }

    public void setTextForCheck(String textForCheck) {
        this.textForCheck = textForCheck;
    }
}