package tasks.Task3.AbstractFactory.project_1_team;

import tasks.Task3.AbstractFactory.IBackDeveloper;
import tasks.Task3.AbstractFactory.IFrontDeveloper;
import tasks.Task3.AbstractFactory.ITeamFactory;
import tasks.Task3.AbstractFactory.ITester;

public class Team1Factory implements ITeamFactory {

    @Override
    public IBackDeveloper getBackDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public IFrontDeveloper getFrontDeveloper() {
        return new JsDeveloper();
    }

    @Override
    public ITester getTester() {
        return new Tester();
    }
}