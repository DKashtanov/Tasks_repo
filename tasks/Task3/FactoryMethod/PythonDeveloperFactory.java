package tasks.Task3.FactoryMethod;

public class PythonDeveloperFactory implements IDeveloperFactory {

    @Override
    public IDeveloper createDeveloper() {
        return new PythonDeveloper();
    }
}