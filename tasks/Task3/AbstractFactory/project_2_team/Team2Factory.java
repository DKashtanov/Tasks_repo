package tasks.Task3.AbstractFactory.project_2_team;

import tasks.Task3.AbstractFactory.IBackDeveloper;
import tasks.Task3.AbstractFactory.IFrontDeveloper;
import tasks.Task3.AbstractFactory.ITeamFactory;
import tasks.Task3.AbstractFactory.ITester;

public class Team2Factory implements ITeamFactory {

    @Override
    public IBackDeveloper getBackDeveloper() {
        return new PHPDeveloper();
    }

    @Override
    public IFrontDeveloper getFrontDeveloper() {
        return new ReactDeveloper();
    }

    @Override
    public ITester getTester() {
        return new Tester();
    }
}