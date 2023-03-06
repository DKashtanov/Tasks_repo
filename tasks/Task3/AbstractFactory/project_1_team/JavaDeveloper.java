package tasks.Task3.AbstractFactory.project_1_team;

import tasks.Task3.AbstractFactory.IBackDeveloper;

public class JavaDeveloper implements IBackDeveloper {

    @Override
    public void writeCode() {
        System.out.println("Team 1 Java developer is writing back.");
    }

}