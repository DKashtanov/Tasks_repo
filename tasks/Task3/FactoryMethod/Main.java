package tasks.Task3.FactoryMethod;

public class Main {

    public static void main(String[] args) {
        IDeveloper developer = createDeveloperByLanguage("Python").createDeveloper();
        developer.writeCode();
    }

    public static IDeveloperFactory createDeveloperByLanguage(String developersLanguage){
        if (developersLanguage.equals("Java"))
            return new JavaDeveloperFactory();
        else if (developersLanguage.equals("Python"))
            return new PythonDeveloperFactory();
        throw new RuntimeException(developersLanguage + " is undefined language.");
    }
}