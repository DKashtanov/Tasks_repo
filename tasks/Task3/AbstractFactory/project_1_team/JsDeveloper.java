package tasks.Task3.AbstractFactory.project_1_team;

import tasks.Task3.AbstractFactory.IFrontDeveloper;

public class JsDeveloper implements IFrontDeveloper {

    @Override
    public void writeCode() {
        System.out.println("Team 1 JS developer is writing front.");
    }
}