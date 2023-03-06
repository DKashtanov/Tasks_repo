package tasks.Task3.FactoryMethod;

public class JavaDeveloperFactory implements IDeveloperFactory {

    @Override
    public IDeveloper createDeveloper() {
        return new JavaDeveloper();
    }
}