package tasks.Task3.AbstractFactory;

public interface ITeamFactory {

    IBackDeveloper getBackDeveloper();
    IFrontDeveloper getFrontDeveloper();
    ITester getTester();
}