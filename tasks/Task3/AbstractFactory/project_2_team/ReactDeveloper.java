package tasks.Task3.AbstractFactory.project_2_team;

import tasks.Task3.AbstractFactory.IFrontDeveloper;

public class ReactDeveloper implements IFrontDeveloper {

    @Override
    public void writeCode() {
        System.out.println("Team 2 React developer is writing front.");
    }
}