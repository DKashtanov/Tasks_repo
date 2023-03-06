package tasks.Task3.AbstractFactory.project_2_team;

import tasks.Task3.AbstractFactory.IBackDeveloper;

public class PHPDeveloper implements IBackDeveloper {

    @Override
    public void writeCode() {
        System.out.println("Team 2 PHP developer is writing back.");
    }
}