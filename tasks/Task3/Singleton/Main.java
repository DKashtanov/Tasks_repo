package tasks.Task3.Singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance("Синглтон создаёт один экземпляр класса.").textForCheck);
        System.out.println(Singleton.getInstance("Синглтон создаёт два экземпляра класса.").textForCheck);

        SingletonEnum.INSTANCE.setTextForCheck("ENUM Синглтон один");
        SingletonEnum.INSTANCE.setTextForCheck("ENUM Синглтон два");
        System.out.println(SingletonEnum.INSTANCE.getTextForCheck());
    }
}