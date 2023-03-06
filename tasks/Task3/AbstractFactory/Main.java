package tasks.Task3.AbstractFactory;

import tasks.Task3.AbstractFactory.project_1_team.Team1Factory;
import tasks.Task3.AbstractFactory.project_2_team.Team2Factory;

public class Main {

    public static void main(String[] args) {
        Team1Factory team1 = new Team1Factory();
        team1.getBackDeveloper().writeCode();
        team1.getFrontDeveloper().writeCode();
        team1.getTester().testCode();

        Team2Factory team2 = new Team2Factory();
        team2.getBackDeveloper().writeCode();
        team2.getFrontDeveloper().writeCode();
        team2.getTester().testCode();
    }
}